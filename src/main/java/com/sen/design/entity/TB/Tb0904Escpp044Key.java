package com.sen.design.entity.TB;

import java.math.BigDecimal;
import java.util.Date;

public class Tb0904Escpp044Key {
    private String ENNMCD;

    private Date INPRDT;

    private BigDecimal GTUPWTLV;

    private BigDecimal GTDWWTLV;

    public Tb0904Escpp044Key(String ENNMCD, Date INPRDT, BigDecimal GTUPWTLV, BigDecimal GTDWWTLV) {
        this.ENNMCD = ENNMCD;
        this.INPRDT = INPRDT;
        this.GTUPWTLV = GTUPWTLV;
        this.GTDWWTLV = GTDWWTLV;
    }

    public Tb0904Escpp044Key() {
        super();
    }

    public String getENNMCD() {
        return ENNMCD;
    }

    public void setENNMCD(String ENNMCD) {
        this.ENNMCD = ENNMCD == null ? null : ENNMCD.trim();
    }

    public Date getINPRDT() {
        return INPRDT;
    }

    public void setINPRDT(Date INPRDT) {
        this.INPRDT = INPRDT;
    }

    public BigDecimal getGTUPWTLV() {
        return GTUPWTLV;
    }

    public void setGTUPWTLV(BigDecimal GTUPWTLV) {
        this.GTUPWTLV = GTUPWTLV;
    }

    public BigDecimal getGTDWWTLV() {
        return GTDWWTLV;
    }

    public void setGTDWWTLV(BigDecimal GTDWWTLV) {
        this.GTDWWTLV = GTDWWTLV;
    }
}