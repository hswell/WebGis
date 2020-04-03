package com.sen.design.entity.DseBz;

import java.math.BigDecimal;

public class DseBzRuninfoRule {
    //测站规则
    private String STCD;
    //测站编号
    private BigDecimal NSW;
    //泵站内江水位(米)
    private BigDecimal WSW;
    //泵站外江水位(米)
    private BigDecimal FOREBAYZ;
    //前池水位
    private BigDecimal NJYCYJZ;

    public DseBzRuninfoRule(String STCD, BigDecimal NSW, BigDecimal WSW, BigDecimal FOREBAYZ, BigDecimal NJYCYJZ) {
        this.STCD = STCD;
        this.NSW = NSW;
        this.WSW = WSW;
        this.FOREBAYZ = FOREBAYZ;
        this.NJYCYJZ = NJYCYJZ;
    }

    public DseBzRuninfoRule() {
        super();
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
    }

    public BigDecimal getNSW() {
        return NSW;
    }

    public void setNSW(BigDecimal NSW) {
        this.NSW = NSW;
    }

    public BigDecimal getWSW() {
        return WSW;
    }

    public void setWSW(BigDecimal WSW) {
        this.WSW = WSW;
    }

    public BigDecimal getFOREBAYZ() {
        return FOREBAYZ;
    }

    public void setFOREBAYZ(BigDecimal FOREBAYZ) {
        this.FOREBAYZ = FOREBAYZ;
    }

    public BigDecimal getNJYCYJZ() {
        return NJYCYJZ;
    }

    public void setNJYCYJZ(BigDecimal NJYCYJZ) {
        this.NJYCYJZ = NJYCYJZ;
    }
}