package com.sen.design.config;

import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.service.BZRelationQuery;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class test {
    public static void main(String[] args) throws ParseException {
        QSTM qstm = new QSTM();
        BZRelationQuery bzRelationQuery = new BZRelationQuery();
        qstm.setSTCD("100000");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String start="2019-06-18 19:10:00";
        String end="2019-06-18 19:40:00";
        qstm.setStartTM(sdf.parse(start));
        qstm.setEndTM(sdf.parse(end));
        List<DseBzRuninfoR> list=bzRelationQuery.getTheAllByTM(qstm.getSTCD(),qstm.getStartTM(),qstm.getEndTM());
        System.out.println(list.size());
    }
}
