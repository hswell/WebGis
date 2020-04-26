package com.sen.design.controller.TB;

import com.sen.design.config.QSTM;
import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseST.DseStPptnReal;
import com.sen.design.entity.DseST.DseStRiverReal;
import com.sen.design.service.BZRelationQuery;
import com.sen.design.service.STRelationQuery;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/ST")
public class STNameQ {
    @Resource
    STRelationQuery stRelationQuery;

    @RequestMapping(value = "/getSTByTM")
    @ResponseBody
    public List<DseStPptnReal> getSTByTM(QSTM qstm){
        ////根据站名字時間段查询水情信息
        System.out.println(qstm.getEndTM()+"  "+qstm.getStartTM()+"  "+qstm.getEndTM());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        return stRelationQuery.getSTByTM(qstm.getSTCD(),qstm.getStartTM(),qstm.getEndTM());
    }

    @RequestMapping(value = "/getRiverByTM")
    @ResponseBody
    public List<DseStRiverReal> getRiverByTM(QSTM qstm){
        ////根据站名字時間段查询水情信息
        System.out.println(qstm.getEndTM()+"  "+qstm.getStartTM()+"  "+qstm.getEndTM());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        return stRelationQuery.getRiverByTM(qstm.getSTCD(),qstm.getStartTM(),qstm.getEndTM());
    }
}
