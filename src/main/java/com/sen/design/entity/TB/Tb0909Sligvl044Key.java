package com.sen.design.entity.TB;

import java.util.Date;

public class Tb0909Sligvl044Key {
    private String ENNMCD;

    private String GTORNM;

    private Date INFNDT;

    public Tb0909Sligvl044Key(String ENNMCD, String GTORNM, Date INFNDT) {
        this.ENNMCD = ENNMCD;
        this.GTORNM = GTORNM;
        this.INFNDT = INFNDT;
    }

    public Tb0909Sligvl044Key() {
        super();
    }

    public String getENNMCD() {
        return ENNMCD;
    }

    public void setENNMCD(String ENNMCD) {
        this.ENNMCD = ENNMCD == null ? null : ENNMCD.trim();
    }

    public String getGTORNM() {
        return GTORNM;
    }

    public void setGTORNM(String GTORNM) {
        this.GTORNM = GTORNM == null ? null : GTORNM.trim();
    }

    public Date getINFNDT() {
        return INFNDT;
    }

    public void setINFNDT(Date INFNDT) {
        this.INFNDT = INFNDT;
    }
}