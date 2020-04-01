package com.sen.design.entity;

import java.math.BigDecimal;

public class DseBzPumb extends DseBzPumbKey {
    //2.3电排站机组信息表
    private String WATERPUMP_MODAL;

    private BigDecimal d_RUNOFF;

    private BigDecimal d_RAISE;

    private Short ANGLE;

    private Short WATERPUMP_SPEED;

    private String ELEC_MODAL;

    private Short POWER;

    private Short ELEC_SPEED;

    private BigDecimal ELECTRICITY;

    private String FGMR;

    private String FPATH;

    private String BZLX;

    private String DJLX;

    private BigDecimal DZEDDY;

    private BigDecimal DZEDDL;

    private BigDecimal ZZEDDY;

    private BigDecimal ZZEDDL;

    public DseBzPumb(String ENNMCD, String AIRCREWNM, String WATERPUMP_MODAL, BigDecimal d_RUNOFF, BigDecimal d_RAISE, Short ANGLE, Short WATERPUMP_SPEED, String ELEC_MODAL, Short POWER, Short ELEC_SPEED, BigDecimal ELECTRICITY, String FGMR, String FPATH, String BZLX, String DJLX, BigDecimal DZEDDY, BigDecimal DZEDDL, BigDecimal ZZEDDY, BigDecimal ZZEDDL) {
        super(ENNMCD, AIRCREWNM);
        this.WATERPUMP_MODAL = WATERPUMP_MODAL;
        this.d_RUNOFF = d_RUNOFF;
        this.d_RAISE = d_RAISE;
        this.ANGLE = ANGLE;
        this.WATERPUMP_SPEED = WATERPUMP_SPEED;
        this.ELEC_MODAL = ELEC_MODAL;
        this.POWER = POWER;
        this.ELEC_SPEED = ELEC_SPEED;
        this.ELECTRICITY = ELECTRICITY;
        this.FGMR = FGMR;
        this.FPATH = FPATH;
        this.BZLX = BZLX;
        this.DJLX = DJLX;
        this.DZEDDY = DZEDDY;
        this.DZEDDL = DZEDDL;
        this.ZZEDDY = ZZEDDY;
        this.ZZEDDL = ZZEDDL;
    }

    public DseBzPumb() {
        super();
    }

    public String getWATERPUMP_MODAL() {
        return WATERPUMP_MODAL;
    }

    public void setWATERPUMP_MODAL(String WATERPUMP_MODAL) {
        this.WATERPUMP_MODAL = WATERPUMP_MODAL == null ? null : WATERPUMP_MODAL.trim();
    }

    public BigDecimal getD_RUNOFF() {
        return d_RUNOFF;
    }

    public void setD_RUNOFF(BigDecimal d_RUNOFF) {
        this.d_RUNOFF = d_RUNOFF;
    }

    public BigDecimal getD_RAISE() {
        return d_RAISE;
    }

    public void setD_RAISE(BigDecimal d_RAISE) {
        this.d_RAISE = d_RAISE;
    }

    public Short getANGLE() {
        return ANGLE;
    }

    public void setANGLE(Short ANGLE) {
        this.ANGLE = ANGLE;
    }

    public Short getWATERPUMP_SPEED() {
        return WATERPUMP_SPEED;
    }

    public void setWATERPUMP_SPEED(Short WATERPUMP_SPEED) {
        this.WATERPUMP_SPEED = WATERPUMP_SPEED;
    }

    public String getELEC_MODAL() {
        return ELEC_MODAL;
    }

    public void setELEC_MODAL(String ELEC_MODAL) {
        this.ELEC_MODAL = ELEC_MODAL == null ? null : ELEC_MODAL.trim();
    }

    public Short getPOWER() {
        return POWER;
    }

    public void setPOWER(Short POWER) {
        this.POWER = POWER;
    }

    public Short getELEC_SPEED() {
        return ELEC_SPEED;
    }

    public void setELEC_SPEED(Short ELEC_SPEED) {
        this.ELEC_SPEED = ELEC_SPEED;
    }

    public BigDecimal getELECTRICITY() {
        return ELECTRICITY;
    }

    public void setELECTRICITY(BigDecimal ELECTRICITY) {
        this.ELECTRICITY = ELECTRICITY;
    }

    public String getFGMR() {
        return FGMR;
    }

    public void setFGMR(String FGMR) {
        this.FGMR = FGMR == null ? null : FGMR.trim();
    }

    public String getFPATH() {
        return FPATH;
    }

    public void setFPATH(String FPATH) {
        this.FPATH = FPATH == null ? null : FPATH.trim();
    }

    public String getBZLX() {
        return BZLX;
    }

    public void setBZLX(String BZLX) {
        this.BZLX = BZLX == null ? null : BZLX.trim();
    }

    public String getDJLX() {
        return DJLX;
    }

    public void setDJLX(String DJLX) {
        this.DJLX = DJLX == null ? null : DJLX.trim();
    }

    public BigDecimal getDZEDDY() {
        return DZEDDY;
    }

    public void setDZEDDY(BigDecimal DZEDDY) {
        this.DZEDDY = DZEDDY;
    }

    public BigDecimal getDZEDDL() {
        return DZEDDL;
    }

    public void setDZEDDL(BigDecimal DZEDDL) {
        this.DZEDDL = DZEDDL;
    }

    public BigDecimal getZZEDDY() {
        return ZZEDDY;
    }

    public void setZZEDDY(BigDecimal ZZEDDY) {
        this.ZZEDDY = ZZEDDY;
    }

    public BigDecimal getZZEDDL() {
        return ZZEDDL;
    }

    public void setZZEDDL(BigDecimal ZZEDDL) {
        this.ZZEDDL = ZZEDDL;
    }
}