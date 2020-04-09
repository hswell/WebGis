package com.sen.design.controller.TB;

import com.sen.design.entity.DseBz.DseBzPumb;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import com.sen.design.service.TBRelationQuery;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/TB")
public class TBAllNameQ {
    @Resource
    TBRelationQuery tbRelationQuery;
    @RequestMapping("/allNameQuerylist")
    public List<String> queryList(){
        List<Tb0001Prnmsr044> tb0001Prnmsr044=tbRelationQuery.tbQueryList();
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
}
