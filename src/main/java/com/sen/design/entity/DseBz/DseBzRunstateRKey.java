package com.sen.design.entity.DseBz;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DseBzRunstateRKey {
    private String STCD;
    //测站编号
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date TM;
    //采集时间

    public DseBzRunstateRKey(String STCD, Date TM) {
        this.STCD = STCD;
        this.TM = TM;
    }

    public DseBzRunstateRKey() {
        super();
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
    }

    public Date getTM() {
        return TM;
    }

    public void setTM(Date TM) {
        this.TM = TM;
    }
}