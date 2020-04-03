package com.sen.design.entity.DseBz;

public class DseBzRuninfoRealKey {
    private String STCD;
    //测站编号

    private String AIRCREWNM;
    //机组名称 对应机组编号
    private String PIPENM;
    //管道名称
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