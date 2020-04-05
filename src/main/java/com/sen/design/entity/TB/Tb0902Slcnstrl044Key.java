package com.sen.design.entity.TB;

import java.util.Date;

public class Tb0902Slcnstrl044Key {
    //2.11水闸与控制站表
    private String ENNMCD;
    //水闸名称代码


    private Date INFNDT;
    //资料截止日期

    public Tb0902Slcnstrl044Key(String ENNMCD, Date INFNDT) {
        this.ENNMCD = ENNMCD;
        this.INFNDT = INFNDT;
    }

    public Tb0902Slcnstrl044Key() {
        super();
    }

    public String getENNMCD() {
        return ENNMCD;
    }

    public void setENNMCD(String ENNMCD) {
        this.ENNMCD = ENNMCD == null ? null : ENNMCD.trim();
    }

    public Date getINFNDT() {
        return INFNDT;
    }

    public void setINFNDT(Date INFNDT) {
        this.INFNDT = INFNDT;
    }
}