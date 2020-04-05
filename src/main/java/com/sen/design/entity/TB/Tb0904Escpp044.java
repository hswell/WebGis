package com.sen.design.entity.TB;

import java.math.BigDecimal;
import java.util.Date;

public class Tb0904Escpp044 extends Tb0904Escpp044Key {
    private BigDecimal DSTTFL;
    //下泄总流量(m3/s)

    private String ATID;
    //流水号

    private String SDFL;
    //发送标示位
    private String RMA;
    //备用字段
    private String MDPS;
    //修改人
    private Date MDDT;
    //修改日期

    public Tb0904Escpp044(String ENNMCD, Date INPRDT, BigDecimal GTUPWTLV, BigDecimal GTDWWTLV, BigDecimal DSTTFL, String ATID, String SDFL, String RMA, String MDPS, Date MDDT) {
        super(ENNMCD, INPRDT, GTUPWTLV, GTDWWTLV);
        this.DSTTFL = DSTTFL;
        this.ATID = ATID;
        this.SDFL = SDFL;
        this.RMA = RMA;
        this.MDPS = MDPS;
        this.MDDT = MDDT;
    }

    public Tb0904Escpp044() {
        super();
    }

    public BigDecimal getDSTTFL() {
        return DSTTFL;
    }

    public void setDSTTFL(BigDecimal DSTTFL) {
        this.DSTTFL = DSTTFL;
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