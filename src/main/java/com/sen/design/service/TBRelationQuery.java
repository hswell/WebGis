package com.sen.design.service;

import com.sen.design.dao.TB.DseTb0001RemarkBMapper;
import com.sen.design.dao.TB.Tb0001Prnmsr044Mapper;
import com.sen.design.entity.TB.DseTb0001RemarkB;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TBRelationQuery {
    @Autowired
    Tb0001Prnmsr044Mapper tb0001Prnmsr044Mapper;
    DseTb0001RemarkBMapper dseTb0001RemarkBMapper;
    public List<Tb0001Prnmsr044> tbQueryList() {
        //查询所有信息
        return tb0001Prnmsr044Mapper.queryList();
    }
    public List<DseTb0001RemarkB> dseQueryList() {
        //查询所有信息
        return dseTb0001RemarkBMapper.queryList();
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



}
