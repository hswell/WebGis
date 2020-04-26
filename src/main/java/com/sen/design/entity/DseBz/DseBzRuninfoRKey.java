package com.sen.design.entity.DseBz;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DseBzRuninfoRKey {
    private String STCD;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date TM;

    private String AIRCREWNM;

    private String PIPENM;

    public DseBzRuninfoRKey(String STCD, Date TM, String AIRCREWNM, String PIPENM) {
        this.STCD = STCD;
        this.TM = TM;
        this.AIRCREWNM = AIRCREWNM;
        this.PIPENM = PIPENM;
    }

    public DseBzRuninfoRKey() {
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

    public String getAIRCREWNM() {
        return AIRCREWNM;
    }

    public void setAIRCREWNM(String AIRCREWNM) {
        this.AIRCREWNM = AIRCREWNM == null ? null : AIRCREWNM.trim();
    }

    public String getPIPENM() {
        return PIPENM;
    }

    public void setPIPENM(String PIPENM) {
        this.PIPENM = PIPENM == null ? null : PIPENM.trim();
    }
}