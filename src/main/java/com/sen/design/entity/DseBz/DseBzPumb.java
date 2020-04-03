package com.sen.design.entity.DseBz;

import java.math.BigDecimal;

public class DseBzPumb extends DseBzPumbKey {
    //2.3电排站机组信息表
    private String WATERPUMP_MODAL;
    //水泵型号
    private BigDecimal d_RUNOFF;
    //水泵设计流量(立方米/秒)


    private BigDecimal d_RAISE;
    //水泵设计扬程(米)
    private Short ANGLE;
    //水泵叶片角度(度)
    private Short WATERPUMP_SPEED;
    //水泵额定转速







    private String ELEC_MODAL;
    // 电机型号
    private Short POWER;
    //电机功率(兆瓦)
    private Short ELEC_SPEED;
    //电机额定转速
    private BigDecimal ELECTRICITY;
    //电机额定电流
    private String FGMR;
    //图号(对应工程图库表图号)
    private String FPATH;
    //FPATH
    private String BZLX;
    //流轴
    private String DJLX;
    //卧式 立式
    private BigDecimal DZEDDY;
    //不晓得是啥很多都是null
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