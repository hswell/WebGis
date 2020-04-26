package com.sen.design.controller.TB;

import com.sen.design.service.STRelationQuery;
import com.sen.design.service.SZRelationQuery;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/SZ")
public class SZNanmeQ {
    @Resource
    SZRelationQuery szRelationQuery;
    @RequestMapping(value = "/getSzName", method = RequestMethod.GET)
    //通过名字最近运行信息
    public List<String> getSzName(){
        //獲取所有名字
        return szRelationQuery.getSzName();
    }
}
