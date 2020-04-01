package com.sen.design.entity;

import java.util.Date;

public class DseBzRunstateRKey {
    private String STCD;

    private Date TM;

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