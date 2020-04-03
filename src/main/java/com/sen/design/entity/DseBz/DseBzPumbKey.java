package com.sen.design.entity.DseBz;

public class DseBzPumbKey {

    private String ENNMCD;
    //电排站编号
    private String AIRCREWNM;
    //机组编号
    public DseBzPumbKey(String ENNMCD, String AIRCREWNM) {
        this.ENNMCD = ENNMCD;
        this.AIRCREWNM = AIRCREWNM;
    }

    @Override
    public String toString() {
        return "DseBzPumbKey{" +
                "ENNMCD='" + ENNMCD + '\'' +
                ", AIRCREWNM='" + AIRCREWNM + '\'' +
                '}';
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