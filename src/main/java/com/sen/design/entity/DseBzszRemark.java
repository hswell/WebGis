package com.sen.design.entity;

public class DseBzszRemark {
    //2.6泵站水闸关联
    private String BZSTCD;
    //泵站编码(测站)



    private String SZSTCD;
    //水闸编码(测站)
    private String NT;
    //备注
    private String SZSTCD2;

    public DseBzszRemark(String BZSTCD, String SZSTCD, String NT, String SZSTCD2) {
        this.BZSTCD = BZSTCD;
        this.SZSTCD = SZSTCD;
        this.NT = NT;
        this.SZSTCD2 = SZSTCD2;
    }

    public DseBzszRemark() {
        super();
    }

    public String getBZSTCD() {
        return BZSTCD;
    }

    public void setBZSTCD(String BZSTCD) {
        this.BZSTCD = BZSTCD == null ? null : BZSTCD.trim();
    }

    public String getSZSTCD() {
        return SZSTCD;
    }

    public void setSZSTCD(String SZSTCD) {
        this.SZSTCD = SZSTCD == null ? null : SZSTCD.trim();
    }

    public String getNT() {
        return NT;
    }

    public void setNT(String NT) {
        this.NT = NT == null ? null : NT.trim();
    }

    public String getSZSTCD2() {
        return SZSTCD2;
    }

    public void setSZSTCD2(String SZSTCD2) {
        this.SZSTCD2 = SZSTCD2 == null ? null : SZSTCD2.trim();
    }
}