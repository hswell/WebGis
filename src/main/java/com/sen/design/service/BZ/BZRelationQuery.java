package com.sen.design.service.BZ;

import com.sen.design.dao.DseBz.DseBzRuninfoRMapper;
import com.sen.design.dao.DseBz.DseBzRunstateRMapper;
import com.sen.design.dao.DseST.StStbprpBMapper;
import com.sen.design.dao.TB.DseTb0001RemarkBMapper;
import com.sen.design.dao.TB.Tb0001Prnmsr044Mapper;
import com.sen.design.entity.DseBz.DseBzRunState;
import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseBz.DseBzRunstateR;
import com.sen.design.entity.DseST.StStbprpB;
import com.sen.design.entity.TB.DseTb0001RemarkB;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BZRelationQuery {
    @Autowired
    Tb0001Prnmsr044Mapper tb0001Prnmsr044Mapper;
    @Autowired
    DseTb0001RemarkBMapper dseTb0001RemarkBMapper;
    @Autowired
    DseBzRuninfoRMapper dseBzRuninfoRMapper;
    @Autowired
    DseBzRunstateRMapper dseBzRunstateRMapper;
    @Autowired
    StStbprpBMapper stStbprpBMapper;
    public List<Tb0001Prnmsr044> tbQueryList() {
        //查询所有信息
        return tb0001Prnmsr044Mapper.queryList();
    }
    public List<DseTb0001RemarkB> dseQueryList() {
        //查询所有信息
        return dseTb0001RemarkBMapper.queryList();
    }
    public List<String> getBZName(){
        List<String> all=stStbprpBMapper.getAllName();
        if (all!=null){
            return all;
        }
        System.out.println("null");
        return null;
    }

    public List<String> getAllStcd(){
        //根据站名字查询对应STCD
        List<String> list=stStbprpBMapper.getAllSTCD();

        if (list != null) {
            return list;
        }
        return null;
    }
    public String stcdQuery(String ENNM){
        //根据站名字查询对应STCD
            //根据站名字查询对应STCD
        if (ENNM!=null) {
            String STCD=null;
             STCD = stStbprpBMapper.getSTCD(ENNM);
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
    public List<DseBzRuninfoR> latestAllm(){
        //根据名字查询最近信息
        List<String>list= getAllStcd();
        List<DseBzRuninfoR> mesag=new ArrayList<>();
        if (list!=null){
            for (String STCD:list
                 ) {
                DseBzRuninfoR r=dseBzRuninfoRMapper.selectLatestM(STCD);
                mesag.add(r);
            }
            return mesag;
        }
       return null;
    }
    public DseBzRuninfoR getTheAllbyName(String name){
        //根据名字查询最近信息
        String stcd=stcdQuery(name);
        if (stcd!=null){
          DseBzRuninfoR r=dseBzRuninfoRMapper.selectLatestM(stcd);

            return r;
        }
        return null;
    }
    public List<DseBzRuninfoR> getTheAllByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字查询历史运行信息
        String STCD=stcdQuery(ENNM);

        return dseBzRuninfoRMapper.selectByStcdTime(STCD,statTime,endTime);
    }
    public List<DseBzRunstateR> getRunStateByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字查询泵站开关机统计表
        String STCD=stcdQuery(ENNM);

        return dseBzRunstateRMapper.selectByStcdTime(STCD,statTime,endTime);
    }
    public  List<DseBzRunState> getRunState(String ENNM, Date statTime, Date endTime){
        //根据站名字查询泵站开关机以及水位
        List<DseBzRunState> list=new ArrayList<>();
        List<DseBzRunstateR> listR=getRunStateByTM(ENNM, statTime, endTime);
        for (DseBzRunstateR r:listR
             ) {
            DseBzRunState stata=new DseBzRunState();
            stata.setNSW(r.getNSW());
            stata.setSTATE(r.getSTATE());
            stata.setSTCD(r.getSTCD());
            stata.setWSW(r.getWSW());
            stata.setTM(r.getTM());
            list.add(stata);
        }
        return list;
    }

    public  DseBzRunstateR getLatestRunState(String ENNM){
        //根据名字查询泵站开关机以及水位
        if (ENNM==null){
            return null;
        }
        String STCD=stcdQuery(ENNM);
        DseBzRunstateR dseBzRunstateR=dseBzRunstateRMapper.selectLatestM(STCD);
        return dseBzRunstateR;
    }


}
