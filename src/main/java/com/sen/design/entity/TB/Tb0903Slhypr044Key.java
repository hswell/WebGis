package com.sen.design.entity.TB;

import java.util.Date;

public class Tb0903Slhypr044Key {
    private String ENNMCD;

    private Date INFNDT;

    public Tb0903Slhypr044Key(String ENNMCD, Date INFNDT) {
        this.ENNMCD = ENNMCD;
        this.INFNDT = INFNDT;
    }

    public Tb0903Slhypr044Key() {
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