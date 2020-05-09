package com.sen.design.service.BZ;

import com.sen.design.dao.DseBz.DseBzRuninfoRMapper;
import com.sen.design.dao.DseBz.DseBzRunstateRMapper;
import com.sen.design.dao.DseST.StStbprpBMapper;
import com.sen.design.dao.TB.DseTb0001RemarkBMapper;
import com.sen.design.dao.TB.Tb0001Prnmsr044Mapper;
import com.sen.design.dao.TB.Tb1502Meidsbi044Mapper;
import com.sen.design.entity.DseBz.*;
import com.sen.design.entity.DseST.StStbprpB;
import com.sen.design.entity.TB.DseTb0001RemarkB;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import com.sen.design.entity.TB.Tb1502Meidsbi044;
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
    @Autowired
    Tb1502Meidsbi044Mapper tb1502Meidsbi044Mapper;
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
    public List<DseBZRuninforE> getLatestAll(){
        //查询所有泵站实时最近信息

        List<String>list= getAllStcd();
        List<DseBZRuninforE> mesag=new ArrayList<>();
        if (list!=null){
            for (String STCD:list
            ) {
              
                Tb1502Meidsbi044 tb=tb1502Meidsbi044Mapper.selectBySTCD(STCD);

                List<DseBzRuninfoR> re=dseBzRuninfoRMapper.selectLatestL(STCD);
                for (DseBzRuninfoR r:re
                     ) {
                    String state=null;
                    DseBZRuninforE e=new DseBZRuninforE();
                    if (r.getAIRCREWSTATE().equals("1")){
                        state="正在运行";
                    }else {
                        state="已关机";
                    }
                    e.setAVDRFL(tb.getAVDRFL());
                    e.setAIRCREWSTATE(state);
                    e.setDSINCP(tb.getDSINCP());
                    e.setINSTANTANEOUSQ(r.getINSTANTANEOUSQ());
                    e.setWSW(r.getWSW());
                    e.setNSW(r.getNSW());
                    e.setAIRCREWNM(r.getAIRCREWNM());
                    e.setINSTANTANEOUSQ(r.getINSTANTANEOUSQ());
                    e.setTM(r.getTM());
                    e.setSTCD(nameQuery(r.getSTCD()));
                    mesag.add(e);
                }

            }
            return mesag;
        }
        return null;
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
    public List<DseBZRuninforH> getAllHByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字查询历史运行信息
        String STCD=stcdQuery(ENNM);
        Tb1502Meidsbi044 tb=tb1502Meidsbi044Mapper.selectBySTCD(STCD);

        List<DseBZRuninforH> rList=new ArrayList<>();
        List<DseBzRuninfoR> list=dseBzRuninfoRMapper.selectByStcdTime(STCD,statTime,endTime);
        if (list!=null){
            for (DseBzRuninfoR r:list
            ) {
                DseBZRuninforH h=new DseBZRuninforH();
                h.setAIRCREWNM(r.getAIRCREWNM());
                h.setAIRCREWSTATE(r.getAIRCREWSTATE());
                h.setDISTANCE(r.getDISTANCE());
                h.setDSINCP(tb.getDSINCP());
                h.setPOWERACTIVE(r.getPOWERACTIVE());
                h.setSTCD(ENNM);
                h.setTM(r.getTM());
                rList.add(h);
            }
            return rList;
        }
        return null;
    }
    public List<DseBzRunstateR> getRunStateByTM(String ENNM, Date statTime, Date endTime){
        //根据站名字查询泵站开关机统计表
        String STCD=stcdQuery(ENNM);
        List<DseBzRunstateR>list=dseBzRunstateRMapper.selectByStcdTime(STCD,statTime,endTime);
        for (DseBzRunstateR r:list
             ) {
            r.setSTCD(ENNM);
        }
        return list;
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
            stata.setSTCD(ENNM);
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
