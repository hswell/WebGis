package com.sen.design.service.SZ;

import com.sen.design.dao.DseST.StStbprpBMapper;
import com.sen.design.dao.DseSz.DseSzRuninfoRMapper;
import com.sen.design.dao.DseSz.DseSzRuninfoRealMapper;
import com.sen.design.dao.DseSz.DseSzRunstateRMapper;
import com.sen.design.dao.TB.DseTb0001RemarkBMapper;
import com.sen.design.dao.TB.Tb0001Prnmsr044Mapper;
import com.sen.design.entity.DseST.StStbprpB;
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
    @Autowired
    StStbprpBMapper stStbprpBMapper;
    public String stcdQuery(String ENNM){
        //根据站名字查询对应STCD
        String STCD = stStbprpBMapper.getSTCD(ENNM);
        if (STCD != null) {
            return STCD;
        }
        return null;
    }
    public String getSzNameByBz(String name){
        String STCD=stcdQuery(name);
        String ennmcd=dseTb0001RemarkBMapper.getEnnmcd(STCD);
        String ennm=tb0001Prnmsr044Mapper.getEnnm(ennmcd);
        return ennm;
    }
    public String SZnameQuery(String stcd){
        //根据STCD查询对应站名字
        if (stcd!=null) {
            String name=null;
            name = tb0001Prnmsr044Mapper.getSZname(stcd);
            if (name != null) {
                return name;
            }
        }
        return stcd;

    }
    public List<String> getSzName(){


        List<String> allname=new ArrayList<>();
        allname=tb0001Prnmsr044Mapper.getAllSZN();

        return  allname;
    }
    public List<DseSzRuninfoReal> getSzRuninfoRealByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字時間段查询水閘相關信
        List<String>SzName= getSzName();
        String STCD=stcdQuery(ENNM);

        return dseSzRuninfoRealMapper.selectByStcdTime(STCD,statTime,endTime);
    }
    public String SZCheck(String s1){
        if (s1==null){
            return "闸门关闭";
        }
        if(s1.equals("0")){
            return "闸门上升";
        }
        if(s1.equals("1")){
            return "闸门下降";
        }if(s1.equals("2")){
            return "闸门全关";
        }if(s1.equals("3")){
            return "闸门全开";
        }if(s1.equals("4")){
            return "闸门解锁";
        }
        if(s1.equals("4")){
            return "闸门解位";
        }
        return "关闭";
    }
    public List<DseSzRunE> getAllSZinfo() {
        //根据站名字時間段查询水閘運行狀態

        List<DseSzRuninfoReal> list=dseSzRuninfoRealMapper.getAllSZ();
        List<DseSzRunE> sz=new ArrayList<>();
        for (DseSzRuninfoReal r:list
        ) {
            DseSzRunE s1=new DseSzRunE();
            s1.setSTCD(SZnameQuery(r.getSTCD()));
            s1.setTM(r.getTM());
            s1.setN1(SZCheck(r.getRUNST1()));
            s1.setN2(SZCheck(r.getRUNST2()));
            s1.setN3(SZCheck(r.getRUNST3()));
            s1.setN4(SZCheck(r.getRUNST4()));
            s1.setN5(SZCheck(r.getN5()));
            s1.setN6(SZCheck(r.getRUNST6()));
            sz.add(s1);
        }

        if (sz!=null){
            return sz;
        }
        return null;
    }
    public List<DseSzRunE> getSZRunStateByTM(String ENNM, Date statTime, Date endTime) throws IllegalAccessException {
        //根据站名字時間段查询水閘運行狀態
        String STCD=stcdQuery(ENNM);
        List<DseSzRunE> sz=new ArrayList<>();

        List<DseSzRuninfoReal> list=getSzRuninfoRealByTM(STCD,statTime,endTime);

        for (DseSzRuninfoReal r:list
        ) {
            DseSzRunE s1=new DseSzRunE();
            s1.setSTCD(SZnameQuery(r.getSTCD()));
            s1.setTM(r.getTM());
            s1.setN1(SZCheck(r.getRUNST1()));
            s1.setN2(SZCheck(r.getRUNST2()));
            s1.setN3(SZCheck(r.getRUNST3()));
            s1.setN4(SZCheck(r.getRUNST4()));
            s1.setN5(SZCheck(r.getN5()));
            s1.setN6(SZCheck(r.getRUNST6()));
            sz.add(s1);
            }

        if (sz!=null){
            return sz;
        }
        return null;
    }


}
