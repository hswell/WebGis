package com.sen.design.controller;

import com.sen.design.entity.AdCdB;
import com.sen.design.entity.DseBzPumb;
import com.sen.design.service.DseBzPumbService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
}
