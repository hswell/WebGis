package com.sen.design.entity.TB;

import java.math.BigDecimal;
import java.util.Date;

public class Tb0903Slhypr044 extends Tb0903Slhypr044Key {
    //2.12水闸设计参数
//    设计闸上水位(m)
//    设计闸下水位(m)
//    设计过闸流量(m3/s)
//    设计洪水标准 重现期［年］
//    设计防洪闸上水位(m)
//    设计防洪闸下水位(m)
//    设计防洪过闸流量(m3/s)
//    校核洪水标准
//    校核闸上水位(m)
//    校核闸下水位(m)
//    校核过闸流量(m3/s)
//    备注
//            流水号
//    发送标示位
//            备用字段
//    修改人
//            修改日期

    private BigDecimal DGUWLV;

    private BigDecimal DGDWLV;

    private BigDecimal DSEXGTFL;

    private Integer DSFLST;

    private BigDecimal DCGUWLV;

    private BigDecimal DCGDWLV;

    private BigDecimal DCEGFL;

    private String CHFLST;

    private BigDecimal CGUWLV;

    private BigDecimal CGDWLV;

    private BigDecimal CHEXGTFL;

    private String RM;

    private String ATID;

    private String SDFL;

    private String RMA;

    private String MDPS;

    private Date MDDT;

    public Tb0903Slhypr044(String ENNMCD, Date INFNDT, BigDecimal DGUWLV, BigDecimal DGDWLV, BigDecimal DSEXGTFL, Integer DSFLST, BigDecimal DCGUWLV, BigDecimal DCGDWLV, BigDecimal DCEGFL, String CHFLST, BigDecimal CGUWLV, BigDecimal CGDWLV, BigDecimal CHEXGTFL, String RM, String ATID, String SDFL, String RMA, String MDPS, Date MDDT) {
        super(ENNMCD, INFNDT);
        this.DGUWLV = DGUWLV;
        this.DGDWLV = DGDWLV;
        this.DSEXGTFL = DSEXGTFL;
        this.DSFLST = DSFLST;
        this.DCGUWLV = DCGUWLV;
        this.DCGDWLV = DCGDWLV;
        this.DCEGFL = DCEGFL;
        this.CHFLST = CHFLST;
        this.CGUWLV = CGUWLV;
        this.CGDWLV = CGDWLV;
        this.CHEXGTFL = CHEXGTFL;
        this.RM = RM;
        this.ATID = ATID;
        this.SDFL = SDFL;
        this.RMA = RMA;
        this.MDPS = MDPS;
        this.MDDT = MDDT;
    }

    public Tb0903Slhypr044() {
        super();
    }

    public BigDecimal getDGUWLV() {
        return DGUWLV;
    }

    public void setDGUWLV(BigDecimal DGUWLV) {
        this.DGUWLV = DGUWLV;
    }

    public BigDecimal getDGDWLV() {
        return DGDWLV;
    }

    public void setDGDWLV(BigDecimal DGDWLV) {
        this.DGDWLV = DGDWLV;
    }

    public BigDecimal getDSEXGTFL() {
        return DSEXGTFL;
    }

    public void setDSEXGTFL(BigDecimal DSEXGTFL) {
        this.DSEXGTFL = DSEXGTFL;
    }

    public Integer getDSFLST() {
        return DSFLST;
    }

    public void setDSFLST(Integer DSFLST) {
        this.DSFLST = DSFLST;
    }

    public BigDecimal getDCGUWLV() {
        return DCGUWLV;
    }

    public void setDCGUWLV(BigDecimal DCGUWLV) {
        this.DCGUWLV = DCGUWLV;
    }

    public BigDecimal getDCGDWLV() {
        return DCGDWLV;
    }

    public void setDCGDWLV(BigDecimal DCGDWLV) {
        this.DCGDWLV = DCGDWLV;
    }

    public BigDecimal getDCEGFL() {
        return DCEGFL;
    }

    public void setDCEGFL(BigDecimal DCEGFL) {
        this.DCEGFL = DCEGFL;
    }

    public String getCHFLST() {
        return CHFLST;
    }

    public void setCHFLST(String CHFLST) {
        this.CHFLST = CHFLST == null ? null : CHFLST.trim();
    }

    public BigDecimal getCGUWLV() {
        return CGUWLV;
    }

    public void setCGUWLV(BigDecimal CGUWLV) {
        this.CGUWLV = CGUWLV;
    }

    public BigDecimal getCGDWLV() {
        return CGDWLV;
    }

    public void setCGDWLV(BigDecimal CGDWLV) {
        this.CGDWLV = CGDWLV;
    }

    public BigDecimal getCHEXGTFL() {
        return CHEXGTFL;
    }

    public void setCHEXGTFL(BigDecimal CHEXGTFL) {
        this.CHEXGTFL = CHEXGTFL;
    }

    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM == null ? null : RM.trim();
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