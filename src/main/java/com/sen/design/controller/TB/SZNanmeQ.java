package com.sen.design.controller.TB;

import com.sen.design.config.DateVo;
import com.sen.design.config.QSTM;
import com.sen.design.entity.DseBz.DseBzPumb;
import com.sen.design.entity.DseBz.DseBzPumbKey;
import com.sen.design.entity.DseBz.DseBzRunState;
import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseST.DseStPptnE;
import com.sen.design.entity.DseSz.DseSzRunE;
import com.sen.design.entity.DseSz.DseSzRunstateR;
import com.sen.design.service.BZ.DseBzPumbService;
import com.sen.design.service.SZ.SZRelationQuery;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/SZ")
public class SZNanmeQ {
    @Resource
    SZRelationQuery szRelationQuery;

    @Resource
    private DseBzPumbService service;

    @RequestMapping("/querylist")
    public List<DseBzPumb>   queryList(){
        List<DseBzPumb> dseBzPumbs=service.queryList();

        return dseBzPumbs;
    }
    @RequestMapping(value = "/findBykey/{ENNMCD}", method = RequestMethod.GET)
    public List<DseBzPumb> findBykey(@PathVariable("ENNMCD") String ENNMCD){

        return service.queryByKey(ENNMCD);
    }


    @RequestMapping(path = "/findtokey")
    @ResponseBody
    public DseBzPumb findtokey(DseBzPumbKey dseBzPumbKey)
    {//PathVariable读取不了特殊符号
        return service.select(dseBzPumbKey);
    }


    @RequestMapping(value = "/getDate")
    @ResponseBody
    public DateVo getDate(DateVo vo){
        System.out.println("date1:"+vo.getDate());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(vo.getDate());
        System.out.println("date2:"+date);

        DateVo vo2 = new DateVo();
        vo2.setDate(new Date());
        return vo2;
    }

    @RequestMapping(value = "/getSzName", method = RequestMethod.GET)
    //通过名字最近运行信息
    public List<String> getSzName(){
        //獲取所有名字
        return szRelationQuery.getSzName();
    }
    @RequestMapping(value = "/getTheAll/{name}", method = RequestMethod.GET)
    //通过名字最近运行信息
    public String getTheAll(@PathVariable("name") String name){
        String stcd=szRelationQuery.getSzNameByBz(name);
        return stcd;
    }
    @RequestMapping(value = "/getAllSZinfo")
    @ResponseBody
    public List<DseSzRunE> getAllSZinfo() throws ParseException {
        ////根据站名字時間段查询水情信息

        return szRelationQuery.getAllSZinfo();
    }
    @RequestMapping(value = "/getSZStata")
    @ResponseBody
    public  List<DseSzRunE> getSZStata(QSTM qstm) throws IllegalAccessException, ParseException {
        //获取水位 开机状态
        System.out.println(qstm.getEndTM()+"  "+qstm.getStartTM()+"  "+qstm.getEndTM());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date StartTM = sdf.parse(sdf.format(qstm.getStartTM()));
        Date EndTM=sdf.parse(sdf.format(qstm.getEndTM()));

        List<DseSzRunE> list=szRelationQuery.getSZRunStateByTM(qstm.getSTCD(),StartTM,EndTM);
        if (list==null){
            System.out.println("list is null ");
        }
        return list;
    }
}
