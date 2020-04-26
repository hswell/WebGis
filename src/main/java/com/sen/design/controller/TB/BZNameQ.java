package com.sen.design.controller.TB;

import com.sen.design.config.QSTM;
import com.sen.design.entity.DseBz.*;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import com.sen.design.service.BZRelationQuery;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/BZ")
public class BZNameQ {
    @Resource
    BZRelationQuery bzRelationQuery;
    @RequestMapping("/allNameQuerylist")
    //查询所有站台名称
    public List<String> queryList(){
        List<Tb0001Prnmsr044> tb0001Prnmsr044=bzRelationQuery.tbQueryList();
        List<String> allName = new ArrayList<String>();
        for (Tb0001Prnmsr044 tb:
                tb0001Prnmsr044) {
            allName.add(tb.getENNM());
        }
        if (allName==null){
            return null;
        }
        return allName;
    }

    @RequestMapping(value = "/getBZName", method = RequestMethod.GET)
    //通过名字最近运行信息
    public List<String> getBZName(){
       //獲取所有名字
        return bzRelationQuery.getBZName();
    }
    @RequestMapping(value = "/getTheAll/{name}", method = RequestMethod.GET)
    //通过名字最近运行信息
    public DseBzRuninfoR getTheAll(@PathVariable("name") String name){
        DseBzRuninfoR dseBzRuninfoR=bzRelationQuery.latestAllm(name);
        return dseBzRuninfoR;
    }


    @RequestMapping(value = "/getAllByTM")
    @ResponseBody
    public List<DseBzRuninfoR> getAllByTM(QSTM qstm){
        //根据时间段和站台名获取泵站运行信息
        System.out.println(qstm.getEndTM()+"  "+qstm.getStartTM()+"  "+qstm.getEndTM());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String startTM = sdf.format(qstm.getStartTM());
        String endTM=sdf.format(qstm.getEndTM());
        Date startTime=qstm.getStartTM();
        Date endTime=qstm.getEndTM();
        return bzRelationQuery.getTheAllByTM(qstm.getSTCD(),qstm.getStartTM(),qstm.getEndTM());
    }

    @RequestMapping(value = "/getRunStata")
    @ResponseBody
    public List<DseBzRunState> getRunStata(QSTM qstm){
        //获取水位 开机状态
        System.out.println(qstm.getEndTM()+"  "+qstm.getStartTM()+"  "+qstm.getEndTM());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<DseBzRunState> list=bzRelationQuery.getRunState(qstm.getSTCD(),qstm.getStartTM(),qstm.getEndTM());
        if (list==null){
            System.out.println("list is null ");
        }
        return list;
    }

    @RequestMapping(value = "/getLatestRunState/{name}", method = RequestMethod.GET)
    //通过名字最近运行信息
    public DseBzRunState getLatestRunState(@PathVariable("name") String name){
        DseBzRunState dseBzRunstate=bzRelationQuery.getLatestRunState(name);
        return dseBzRunstate;
    }
}
