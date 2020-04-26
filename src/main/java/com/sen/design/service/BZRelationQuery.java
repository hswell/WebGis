package com.sen.design.service;

import com.sen.design.dao.DseBz.DseBzRuninfoRMapper;
import com.sen.design.dao.DseBz.DseBzRunstateRMapper;
import com.sen.design.dao.TB.DseTb0001RemarkBMapper;
import com.sen.design.dao.TB.Tb0001Prnmsr044Mapper;
import com.sen.design.entity.DseBz.DseBzRunState;
import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseBz.DseBzRunstateR;
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
    public List<Tb0001Prnmsr044> tbQueryList() {
        //查询所有信息
        return tb0001Prnmsr044Mapper.queryList();
    }
    public List<DseTb0001RemarkB> dseQueryList() {
        //查询所有信息
        return dseTb0001RemarkBMapper.queryList();
    }
    public List<String> getBZName(){
        List<String> allSTCD = dseBzRuninfoRMapper.getAllSTCD();
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
            allname.add(ennmcd);
        }
        return  allname;
    }
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
    public DseBzRuninfoR latestAllm(String ENNM){
        //根据名字查询最近信息
        if (ENNM!=null){
            String STCD=stcdQuery(ENNM);
            return dseBzRuninfoRMapper.selectLatestM(STCD);
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
            stata.setFOREBAYZ(r.getFOREBAYZ());
            stata.setNSW(r.getNSW());
            stata.setSTATE(r.getSTATE());
            stata.setSTCD(r.getSTCD());
            stata.setWSW(r.getWSW());
            stata.setTM(r.getTM());
            list.add(stata);
        }
        return list;
    }

    public  DseBzRunState getLatestRunState(String ENNM){
        //根据名字查询泵站开关机以及水位
        if (ENNM==null){
            return null;
        }
        String STCD=stcdQuery(ENNM);
        DseBzRunstateR dseBzRunstateR=dseBzRunstateRMapper.selectLatestM(STCD);
        DseBzRunState stata=new DseBzRunState();
        stata.setFOREBAYZ(dseBzRunstateR.getFOREBAYZ());
        stata.setNSW(dseBzRunstateR.getNSW());
        stata.setSTATE(dseBzRunstateR.getSTATE());
        stata.setSTCD(dseBzRunstateR.getSTCD());
        stata.setWSW(dseBzRunstateR.getWSW());
        stata.setTM(dseBzRunstateR.getTM());
        return stata;
    }


}
