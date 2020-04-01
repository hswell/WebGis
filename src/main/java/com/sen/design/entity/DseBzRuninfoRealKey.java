package com.sen.design.entity;

public class DseBzRuninfoRealKey {
    private String STCD;

    private String AIRCREWNM;

    private String PIPENM;

    public DseBzRuninfoRealKey(String STCD, String AIRCREWNM, String PIPENM) {
        this.STCD = STCD;
        this.AIRCREWNM = AIRCREWNM;
        this.PIPENM = PIPENM;
    }

    public DseBzRuninfoRealKey() {
        super();
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
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