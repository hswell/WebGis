package com.sen.design.entity.TB;

public class DseTb0001RemarkB {
    private String ENNMCD;
    //ENNMCD，STCD实体关联表
    private String STCD;

    public DseTb0001RemarkB(String ENNMCD, String STCD) {
        this.ENNMCD = ENNMCD;
        this.STCD = STCD;
    }

    public DseTb0001RemarkB() {
        super();
    }

    public String getENNMCD() {
        return ENNMCD;
    }

    public void setENNMCD(String ENNMCD) {
        this.ENNMCD = ENNMCD == null ? null : ENNMCD.trim();
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
    }
}