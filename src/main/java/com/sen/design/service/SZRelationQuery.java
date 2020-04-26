package com.sen.design.service;

import com.sen.design.dao.DseSz.DseSzRuninfoRMapper;
import com.sen.design.dao.DseSz.DseSzRuninfoRealMapper;
import com.sen.design.dao.DseSz.DseSzRunstateRMapper;
import com.sen.design.dao.TB.DseTb0001RemarkBMapper;
import com.sen.design.dao.TB.Tb0001Prnmsr044Mapper;
import com.sen.design.entity.DseSz.*;
import com.sen.design.entity.TB.DseTb0001RemarkB;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SZRelationQuery {
    @Autowired
    Tb0001Prnmsr044Mapper tb0001Prnmsr044Mapper;
    @Autowired
    DseTb0001RemarkBMapper dseTb0001RemarkBMapper;
    @Autowired
    DseSzRuninfoRealMapper dseSzRuninfoRealMapper;
    @Autowired
    DseSzRuninfoRMapper dseSzRuninfoRMapper;
    @Autowired
    DseSzRunstateRMapper dseSzRunstateRMapper;

    public String stcdQuery(String ENNM){
        //根据站名字查询对应STCD
        String ENNMCD = null;
        Tb0001Prnmsr044 tb0001Prnmsr044=tb0001Prnmsr044Mapper.selectByENNM(ENNM);
        if (tb0001Prnmsr044!=null){
            ENNMCD=tb0001Prnmsr044.getENNMCD();
        }
        DseTb0001RemarkB Dse=dseTb0001RemarkBMapper.selectByENNMCD(ENNMCD);
        if (Dse!=null){
            return Dse.getSTCD();
        }
        return null;
    }

    public List<String> getSzName(){

        List<String> allSTCD = dseSzRuninfoRealMapper.getAllSTCD();
        //根据STCD对应ENNMCD查询
        List<String> allEnnmcd=new ArrayList<>();

        for (String l1:allSTCD
        ) {
            String ennmcd=dseTb0001RemarkBMapper.getEnnmcd(l1);
            allEnnmcd.add(ennmcd);
        }
        List<String> allname=new ArrayList<>();
        for (String l1:allEnnmcd
        ) {
            String ennmcd=tb0001Prnmsr044Mapper.getEnnm(l1);
            if(ennmcd!=null){
                allname.add(ennmcd);
            }

        }
        return  allname;
    }
    public List<DseSzRuninfoReal> getSzRuninfoRealByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字時間段查询水閘相關信
        String STCD=stcdQuery(ENNM);

        return dseSzRuninfoRealMapper.selectByStcdTime(STCD,statTime,endTime);
    }
    public List<DseSzRunstateR> getSZRunStateByTM(String ENNM, Date statTime, Date endTime) throws IllegalAccessException {
        //根据站名字時間段查询水閘運行狀態
        String STCD=stcdQuery(ENNM);
        List<DseSzRunstateR> sz=new ArrayList<>();

        List<DseSzRuninfoReal> list=getSzRuninfoRealByTM(STCD,statTime,endTime);

        for (DseSzRuninfoReal r:list
        ) {
            Class<? extends DseSzRuninfoReal> d=r.getClass();
            Field[] fs=d.getDeclaredFields();
            for (Field f:fs
                 ) {
                Object value = f.get(r);
                DseSzRunstateR stata=(DseSzRunstateR)value;
                sz.add(stata);
            }

        }
        return sz;
    }


}
