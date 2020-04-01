package com.sen.design.entity;

import java.util.Date;

public class DseSzRunstateRKey {
    private String STCD;

    private Date TM;

    public DseSzRunstateRKey(String STCD, Date TM) {
        this.STCD = STCD;
        this.TM = TM;
    }

    public DseSzRunstateRKey() {
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