package com.sen.design.entity;

import java.util.Date;

public class DseSzRuninfoRKey {
    private String STCD;

    private Date TM;

    public DseSzRuninfoRKey(String STCD, Date TM) {
        this.STCD = STCD;
        this.TM = TM;
    }

    public DseSzRuninfoRKey() {
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