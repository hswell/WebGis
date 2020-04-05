package com.sen.design.entity.TB;

import java.math.BigDecimal;
import java.util.Date;

public class Tb0909Sligvl044 extends Tb0909Sligvl044Key {
    //    闸孔宽度(m)
//    闸孔高度(m)
//    闸门底槛高程(m)
//    闸体结构型式(1:开敞式,2:胸墙式)
//    闸孔数(孔)
//    消能方式
//    闸门顶高程(m)
//    闸门型式
//    闸门数量(扇)
//    启闭机型式
//    启闭机台数(台)
//    单机启闭力(吨)
//    电源配置
//            存在问题
//    流水号
//            发送标示位
//    备用字段
//            修改人
//    修改日期
    private BigDecimal GTORSZ;

    private BigDecimal GTORHG;

    private BigDecimal GTMTEL;

    private String GTBDSTTP;

    private Short GTORNB;

    private String ENDSTP;

    private BigDecimal GTTPEL;

    private String GTTP;

    private Short GTNB;

    private String HDGRTP;

    private Short HDGRNB;

    private Short STLFPW;

    private String PWSPCN;

    private String EXQS;

    private String ATID;

    private String SDFL;

    private String RMA;

    private String MDPS;

    private Date MDDT;

    public Tb0909Sligvl044(String ENNMCD, String GTORNM, Date INFNDT, BigDecimal GTORSZ, BigDecimal GTORHG, BigDecimal GTMTEL, String GTBDSTTP, Short GTORNB, String ENDSTP, BigDecimal GTTPEL, String GTTP, Short GTNB, String HDGRTP, Short HDGRNB, Short STLFPW, String PWSPCN, String EXQS, String ATID, String SDFL, String RMA, String MDPS, Date MDDT) {
        super(ENNMCD, GTORNM, INFNDT);
        this.GTORSZ = GTORSZ;
        this.GTORHG = GTORHG;
        this.GTMTEL = GTMTEL;
        this.GTBDSTTP = GTBDSTTP;
        this.GTORNB = GTORNB;
        this.ENDSTP = ENDSTP;
        this.GTTPEL = GTTPEL;
        this.GTTP = GTTP;
        this.GTNB = GTNB;
        this.HDGRTP = HDGRTP;
        this.HDGRNB = HDGRNB;
        this.STLFPW = STLFPW;
        this.PWSPCN = PWSPCN;
        this.EXQS = EXQS;
        this.ATID = ATID;
        this.SDFL = SDFL;
        this.RMA = RMA;
        this.MDPS = MDPS;
        this.MDDT = MDDT;
    }

    public Tb0909Sligvl044() {
        super();
    }

    public BigDecimal getGTORSZ() {
        return GTORSZ;
    }

    public void setGTORSZ(BigDecimal GTORSZ) {
        this.GTORSZ = GTORSZ;
    }

    public BigDecimal getGTORHG() {
        return GTORHG;
    }

    public void setGTORHG(BigDecimal GTORHG) {
        this.GTORHG = GTORHG;
    }

    public BigDecimal getGTMTEL() {
        return GTMTEL;
    }

    public void setGTMTEL(BigDecimal GTMTEL) {
        this.GTMTEL = GTMTEL;
    }

    public String getGTBDSTTP() {
        return GTBDSTTP;
    }

    public void setGTBDSTTP(String GTBDSTTP) {
        this.GTBDSTTP = GTBDSTTP == null ? null : GTBDSTTP.trim();
    }

    public Short getGTORNB() {
        return GTORNB;
    }

    public void setGTORNB(Short GTORNB) {
        this.GTORNB = GTORNB;
    }

    public String getENDSTP() {
        return ENDSTP;
    }

    public void setENDSTP(String ENDSTP) {
        this.ENDSTP = ENDSTP == null ? null : ENDSTP.trim();
    }

    public BigDecimal getGTTPEL() {
        return GTTPEL;
    }

    public void setGTTPEL(BigDecimal GTTPEL) {
        this.GTTPEL = GTTPEL;
    }

    public String getGTTP() {
        return GTTP;
    }

    public void setGTTP(String GTTP) {
        this.GTTP = GTTP == null ? null : GTTP.trim();
    }

    public Short getGTNB() {
        return GTNB;
    }

    public void setGTNB(Short GTNB) {
        this.GTNB = GTNB;
    }

    public String getHDGRTP() {
        return HDGRTP;
    }

    public void setHDGRTP(String HDGRTP) {
        this.HDGRTP = HDGRTP == null ? null : HDGRTP.trim();
    }

    public Short getHDGRNB() {
        return HDGRNB;
    }

    public void setHDGRNB(Short HDGRNB) {
        this.HDGRNB = HDGRNB;
    }

    public Short getSTLFPW() {
        return STLFPW;
    }

    public void setSTLFPW(Short STLFPW) {
        this.STLFPW = STLFPW;
    }

    public String getPWSPCN() {
        return PWSPCN;
    }

    public void setPWSPCN(String PWSPCN) {
        this.PWSPCN = PWSPCN == null ? null : PWSPCN.trim();
    }

    public String getEXQS() {
        return EXQS;
    }

    public void setEXQS(String EXQS) {
        this.EXQS = EXQS == null ? null : EXQS.trim();
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