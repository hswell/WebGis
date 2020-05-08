package com.sen.design.controller.TB;

import com.sen.design.config.DateVo;
import com.sen.design.config.QSTM;
import com.sen.design.entity.DseBz.*;
import com.sen.design.entity.SYS.SysUser;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import com.sen.design.service.BZ.BZRelationQuery;
import com.sen.design.service.BZ.DseBzPumbService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/BZ")
public class BZNameQ {
    @Resource
    BZRelationQuery bzRelationQuery;
    @Resource
    private DseBzPumbService service;

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
    @CrossOrigin
    @RequestMapping(value = "/getBZName", method = RequestMethod.GET)
    //通过名字最近运行信息
    public List<String> getBZName(){
       //獲取所有名字
        return bzRelationQuery.getBZName();
    }

    @RequestMapping(value = "/getTheAll")
    //通过名字最近运行信息
    public List<DseBzRuninfoR> getTheAll(){
        List<DseBzRuninfoR>  dseBzRuninfoR=bzRelationQuery.latestAllm();
        return dseBzRuninfoR;
    }
    @RequestMapping(value = "/getTheAllbyName/{name}", method = RequestMethod.GET)
    //通过名字最近运行信息
    public DseBzRuninfoR getTheAllbyName(@PathVariable("name") String name){
        DseBzRuninfoR dseBzRuninfoR=bzRelationQuery.getTheAllbyName(name);
        return dseBzRuninfoR;
    }
    @RequestMapping(value = "/getAllStcd")
    //通过名字最近运行信息
    public List<String> getAllStcd(){
        List<String>  dseBzRuninfoR=bzRelationQuery.getAllStcd();
        return dseBzRuninfoR;
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
    @CrossOrigin
    @RequestMapping("/getUsername")
    public String getUsername() {
        SysUser user = new SysUser();
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        if (auth.getPrincipal() instanceof UserDetails) user = (SysUser) auth.getPrincipal();
        return user.getUNAME();

    }
    @RequestMapping(value = "/getRunStataR")
    @ResponseBody
    public List<DseBzRunstateR> getRunStataR(QSTM qstm){
        //获取水位 开机状态
        System.out.println(qstm.getEndTM()+"  "+qstm.getStartTM()+"  "+qstm.getEndTM());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<DseBzRunstateR> list=bzRelationQuery.getRunStateByTM(qstm.getSTCD(),qstm.getStartTM(),qstm.getEndTM());
        if (list==null){
            System.out.println("list is null ");
        }
        return list;
    }

    @RequestMapping(value = "/getLatestRunState/{name}", method = RequestMethod.GET)
    //通过名字最近运行信息
    public DseBzRunstateR getLatestRunState(@PathVariable("name") String name){
        DseBzRunstateR dseBzRunstate=bzRelationQuery.getLatestRunState(name);
        return dseBzRunstate;
    }
}
