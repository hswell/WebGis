package com.sen.design.entity.TB;

import java.util.Date;

public class Tb0001Prnmsr044 {

    private String ENNMCD;

    private String ENNM;

    private String OGID;

    private String ENTYCED;

    private String VLFL;

    private String ATID;

    private String SDFL;

    private String RMA;

    private String MDPS;

    private Date MDDT;
    //字段描述
    //工程名称代码()name
    //工程名称
    //机构代码
    //工程类别码(A-S,K表示水闸)
    //有效标识
    //流水号
    //发送标示位
    //备用字段
    //修改人
    public Tb0001Prnmsr044(String ENNMCD, String ENNM, String OGID, String ENTYCED, String VLFL, String ATID, String SDFL, String RMA, String MDPS, Date MDDT) {
        this.ENNMCD = ENNMCD;
        this.ENNM = ENNM;
        this.OGID = OGID;
        this.ENTYCED = ENTYCED;
        this.VLFL = VLFL;
        this.ATID = ATID;
        this.SDFL = SDFL;
        this.RMA = RMA;
        this.MDPS = MDPS;
        this.MDDT = MDDT;
    }

    public Tb0001Prnmsr044() {
        super();
    }

    public String getENNMCD() {
        return ENNMCD;
    }

    public void setENNMCD(String ENNMCD) {
        this.ENNMCD = ENNMCD == null ? null : ENNMCD.trim();
    }

    public String getENNM() {
        return ENNM;
    }

    public void setENNM(String ENNM) {
        this.ENNM = ENNM == null ? null : ENNM.trim();
    }

    public String getOGID() {
        return OGID;
    }

    public void setOGID(String OGID) {
        this.OGID = OGID == null ? null : OGID.trim();
    }

    public String getENTYCED() {
        return ENTYCED;
    }

    public void setENTYCED(String ENTYCED) {
        this.ENTYCED = ENTYCED == null ? null : ENTYCED.trim();
    }

    public String getVLFL() {
        return VLFL;
    }

    public void setVLFL(String VLFL) {
        this.VLFL = VLFL == null ? null : VLFL.trim();
    }

    public String getATID() {
        return ATID;
    }

    public void setATID(String ATID) {
        this.ATID = ATID == null ? null : ATID.trim();
    }

    public String getSDFL() {
        return SDFL;
    }

    public void setSDFL(String SDFL) {
        this.SDFL = SDFL == null ? null : SDFL.trim();
    }

    public String getRMA() {
        return RMA;
    }

    public void setRMA(String RMA) {
        this.RMA = RMA == null ? null : RMA.trim();
    }

    public String getMDPS() {
        return MDPS;
    }

    public void setMDPS(String MDPS) {
        this.MDPS = MDPS == null ? null : MDPS.trim();
    }

    public Date getMDDT() {
        return MDDT;
    }

    public void setMDDT(Date MDDT) {
        this.MDDT = MDDT;
    }
}