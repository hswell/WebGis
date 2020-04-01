package com.sen.design.entity;

public class DseBzPumbKey {

    private String ENNMCD;

    private String AIRCREWNM;

    public DseBzPumbKey(String ENNMCD, String AIRCREWNM) {
        this.ENNMCD = ENNMCD;
        this.AIRCREWNM = AIRCREWNM;
    }

    public DseBzPumbKey() {
        super();
    }

    public String getENNMCD() {
        return ENNMCD;
    }

    public void setENNMCD(String ENNMCD) {
        this.ENNMCD = ENNMCD == null ? null : ENNMCD.trim();
    }

    public String getAIRCREWNM() {
        return AIRCREWNM;
    }

    public void setAIRCREWNM(String AIRCREWNM) {
        this.AIRCREWNM = AIRCREWNM == null ? null : AIRCREWNM.trim();
    }
}