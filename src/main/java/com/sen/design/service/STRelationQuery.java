package com.sen.design.service;

import com.sen.design.dao.DseST.DseStPptnRealMapper;
import com.sen.design.dao.DseST.DseStRiverRealMapper;
import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseST.DseStPptnReal;
import com.sen.design.entity.DseST.DseStRiverReal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public class STRelationQuery {
    //降雨相關
    BZRelationQuery bzRelationQuery=new BZRelationQuery();
    @Autowired
    DseStPptnRealMapper dseStPptnRealMapper;
    @Autowired
    DseStRiverRealMapper dseStRiverRealMapper;
    public List<DseStPptnReal> getSTByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字時間段查询水情信息
        String STCD=bzRelationQuery.stcdQuery(ENNM);

        return dseStPptnRealMapper.selectByStcdTime(STCD,statTime,endTime);
    }
    public List<DseStRiverReal> getRiverByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字時間段查询河道信息
        String STCD=bzRelationQuery.stcdQuery(ENNM);

        return dseStRiverRealMapper.selectByStcdTime(STCD,statTime,endTime);
    }

}
