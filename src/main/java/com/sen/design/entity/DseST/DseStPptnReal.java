package com.sen.design.entity.DseST;

import java.math.BigDecimal;
import java.util.Date;

public class DseStPptnReal {
    private String STCD;
//测站编码
//时间
//时段降水量单位(mm)
//时段长单位(h)
//降水历时
//日降水量单位(mm)
//天气状况
    private Date TM;

    private BigDecimal DRP;

    private BigDecimal INTV;

    private BigDecimal PDR;

    private BigDecimal DYP;

    private String WTH;

    private BigDecimal DRP1;

    private BigDecimal DRP3;

    private BigDecimal DRP6;

    private BigDecimal DRP12;

    private BigDecimal DRP24;

    private BigDecimal DRPDAY;

    public DseStPptnReal(String STCD, Date TM, BigDecimal DRP, BigDecimal INTV, BigDecimal PDR, BigDecimal DYP, String WTH, BigDecimal DRP1, BigDecimal DRP3, BigDecimal DRP6, BigDecimal DRP12, BigDecimal DRP24, BigDecimal DRPDAY) {
        this.STCD = STCD;
        this.TM = TM;
        this.DRP = DRP;
        this.INTV = INTV;
        this.PDR = PDR;
        this.DYP = DYP;
        this.WTH = WTH;
        this.DRP1 = DRP1;
        this.DRP3 = DRP3;
        this.DRP6 = DRP6;
        this.DRP12 = DRP12;
        this.DRP24 = DRP24;
        this.DRPDAY = DRPDAY;
    }

    public DseStPptnReal() {
        super();
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
    }

    public Date getTM() {
        return TM;
    }

    public void setTM(Date TM) {
        this.TM = TM;
    }

    public BigDecimal getDRP() {
        return DRP;
    }

    public void setDRP(BigDecimal DRP) {
        this.DRP = DRP;
    }

    public BigDecimal getINTV() {
        return INTV;
    }

    public void setINTV(BigDecimal INTV) {
        this.INTV = INTV;
    }

    public BigDecimal getPDR() {
        return PDR;
    }

    public void setPDR(BigDecimal PDR) {
        this.PDR = PDR;
    }

    public BigDecimal getDYP() {
        return DYP;
    }

    public void setDYP(BigDecimal DYP) {
        this.DYP = DYP;
    }

    public String getWTH() {
        return WTH;
    }

    public void setWTH(String WTH) {
        this.WTH = WTH == null ? null : WTH.trim();
    }

    public BigDecimal getDRP1() {
        return DRP1;
    }

    public void setDRP1(BigDecimal DRP1) {
        this.DRP1 = DRP1;
    }

    public BigDecimal getDRP3() {
        return DRP3;
    }

    public void setDRP3(BigDecimal DRP3) {
        this.DRP3 = DRP3;
    }

    public BigDecimal getDRP6() {
        return DRP6;
    }

    public void setDRP6(BigDecimal DRP6) {
        this.DRP6 = DRP6;
    }

    public BigDecimal getDRP12() {
        return DRP12;
    }

    public void setDRP12(BigDecimal DRP12) {
        this.DRP12 = DRP12;
    }

    public BigDecimal getDRP24() {
        return DRP24;
    }

    public void setDRP24(BigDecimal DRP24) {
        this.DRP24 = DRP24;
    }

    public BigDecimal getDRPDAY() {
        return DRPDAY;
    }

    public void setDRPDAY(BigDecimal DRPDAY) {
        this.DRPDAY = DRPDAY;
    }
}