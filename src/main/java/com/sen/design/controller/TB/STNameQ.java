package com.sen.design.controller.TB;

import com.sen.design.config.QSTM;
import com.sen.design.entity.DseST.DseStPptnE;
import com.sen.design.entity.DseST.DseStPptnReal;
import com.sen.design.entity.DseST.DseStRiverE;
import com.sen.design.entity.DseST.DseStRiverReal;
import com.sen.design.service.ST.STRelationQuery;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
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
    public List<DseStPptnE> getSTByTM(QSTM qstm) throws ParseException {
        ////根据站名字時間段查询雨情信息
        System.out.println(qstm.getSTCD()+" "+qstm.getStartTM()+"  "+qstm.getEndTM());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date StartTM = sdf.parse(sdf.format(qstm.getStartTM()));
        Date EndTM=sdf.parse(sdf.format(qstm.getEndTM()));
        return stRelationQuery.getSTByTM(qstm.getSTCD(),StartTM,EndTM);
    }

    @RequestMapping(value = "/getRiverByTM")
    @ResponseBody
    public List<DseStRiverReal> getRiverByTM(QSTM qstm) throws ParseException {
        ////根据站名字時間段查询水情信息
        System.out.println(qstm.getSTCD()+" "+qstm.getStartTM()+"  "+qstm.getEndTM());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date StartTM = sdf.parse(sdf.format(qstm.getStartTM()));
        Date EndTM=sdf.parse(sdf.format(qstm.getEndTM()));
        return stRelationQuery.getRiverByTM(qstm.getSTCD(),StartTM,EndTM);
    }
    @RequestMapping(value = "/getallTM")
    @ResponseBody
    public List<DseStPptnE> getallTM() throws ParseException {
        ////根据站名字時間段查询水情信息

        return stRelationQuery.getallByTM();
    }
    @RequestMapping(value = "/getallrv")
    @ResponseBody
    public List<DseStRiverE> getallrv() throws ParseException {
        ////根据站名字時間段查询水情信息

        return stRelationQuery.getallRiver();
    }
}
