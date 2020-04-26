package com.sen.design.controller;

import com.sen.design.config.DateVo;
import com.sen.design.entity.DseBz.DseBzPumb;
import com.sen.design.entity.DseBz.DseBzPumbKey;
import com.sen.design.service.DseBzPumbService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class DseBzPumbController {
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

}
