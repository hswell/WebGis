package com.sen.design.service.ST;

import com.sen.design.dao.DseST.DseStPptnRealMapper;
import com.sen.design.dao.DseST.DseStRiverRealMapper;
import com.sen.design.dao.DseST.StStbprpBMapper;
import com.sen.design.dao.TB.Tb0001Prnmsr044Mapper;
import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseST.DseStPptnE;
import com.sen.design.entity.DseST.DseStPptnReal;
import com.sen.design.entity.DseST.DseStRiverReal;
import com.sen.design.service.BZ.BZRelationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service

public class STRelationQuery {
    //降雨相關
    @Autowired
    Tb0001Prnmsr044Mapper tb0001Prnmsr044Mapper;
    @Autowired
    StStbprpBMapper stStbprpBMapper;
    @Autowired
    DseStPptnRealMapper dseStPptnRealMapper;
    @Autowired
    DseStRiverRealMapper dseStRiverRealMapper;
    public String stcdQuery(String ENNM){
        //根据站名字查询对应STCD
        if (ENNM!=null) {
            String STCD = stStbprpBMapper.getSTCD(ENNM);
            if (STCD != null) {
                return STCD;
            }
        }
        return null;

    }
    public String nameQuery(String stcd){
        //根据STCD查询对应站名字
        if (stcd!=null) {
            String name=null;
            name = tb0001Prnmsr044Mapper.getEnnm(stcd);
            if (name != null) {
                return name;
            }
        }
        return stcd;

    }
    public List<DseStPptnE> getSTByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字時間段查询水情信息


        String STCD=stcdQuery(ENNM);
        List<DseStPptnE> dseStPptnES=new ArrayList<>();
        List<DseStPptnReal>list= dseStPptnRealMapper.selectByStcdTime(STCD,statTime,endTime);
        if (list!=null){
            for (DseStPptnReal D1:list
            ) {
                DseStPptnE D2=new DseStPptnE();
                D2.setDRP(D1.getDRP());
                D2.setSTCD(ENNM);
                D2.setTM(D1.getTM());
                dseStPptnES.add(D2);
            }
        }
        return dseStPptnES;
    }
    public List<DseStRiverReal> getRiverByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字時間段查询河道信息
        String STCD=stcdQuery(ENNM);
        return dseStRiverRealMapper.selectByStcdTime(STCD,statTime,endTime);
    }
    public List<DseStPptnE> getallByTM(){
        List<DseStPptnE> dseStPptnES=new ArrayList<>();
        List<DseStPptnReal>list= dseStPptnRealMapper.selectAll();
        if (list!=null){
            for (DseStPptnReal D1:list
            ) {
                DseStPptnE D2=new DseStPptnE();
                D2.setDRP(D1.getDRP());
                D2.setSTCD(nameQuery(D1.getSTCD()));
                D2.setTM(D1.getTM());
                dseStPptnES.add(D2);
            }
        }
        return dseStPptnES;
    }

}
