package com.sen.design.entity.DseST;

import java.math.BigDecimal;
import java.util.Date;

public class DseStRiverReal {
    private String STCD;

    //TJSTATUS	统计标志 0 资料整编（不允许修改），1系统自动统计
    private Date TM;

    private BigDecimal z;

    private BigDecimal q;

    private BigDecimal XSA;
    //断面过水面积
    private BigDecimal XSAVV;
    //平平均流速
    private BigDecimal XSMXV;
    //最大流速
    private String FLWCHRCD;
    //河水特征码
    private String WPTN;
    //水施
    private String MSQMT;
    //测流
    private String MSAMT;
    //ceji
    private String MSVMT;
    //测速方法
    public DseStRiverReal(String STCD, Date TM, BigDecimal z, BigDecimal q, BigDecimal XSA, BigDecimal XSAVV, BigDecimal XSMXV, String FLWCHRCD, String WPTN, String MSQMT, String MSAMT, String MSVMT) {
        this.STCD = STCD;
        this.TM = TM;
        this.z = z;
        this.q = q;
        this.XSA = XSA;
        this.XSAVV = XSAVV;
        this.XSMXV = XSMXV;
        this.FLWCHRCD = FLWCHRCD;
        this.WPTN = WPTN;
        this.MSQMT = MSQMT;
        this.MSAMT = MSAMT;
        this.MSVMT = MSVMT;
    }

    public DseStRiverReal() {
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

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getXSA() {
        return XSA;
    }

    public void setXSA(BigDecimal XSA) {
        this.XSA = XSA;
    }

    public BigDecimal getXSAVV() {
        return XSAVV;
    }

    public void setXSAVV(BigDecimal XSAVV) {
        this.XSAVV = XSAVV;
    }

    public BigDecimal getXSMXV() {
        return XSMXV;
    }

    public void setXSMXV(BigDecimal XSMXV) {
        this.XSMXV = XSMXV;
    }

    public String getFLWCHRCD() {
        return FLWCHRCD;
    }

    public void setFLWCHRCD(String FLWCHRCD) {
        this.FLWCHRCD = FLWCHRCD == null ? null : FLWCHRCD.trim();
    }

    public String getWPTN() {
        return WPTN;
    }

    public void setWPTN(String WPTN) {
        this.WPTN = WPTN == null ? null : WPTN.trim();
    }

    public String getMSQMT() {
        return MSQMT;
    }

    public void setMSQMT(String MSQMT) {
        this.MSQMT = MSQMT == null ? null : MSQMT.trim();
    }

    public String getMSAMT() {
        return MSAMT;
    }

    public void setMSAMT(String MSAMT) {
        this.MSAMT = MSAMT == null ? null : MSAMT.trim();
    }

    public String getMSVMT() {
        return MSVMT;
    }

    public void setMSVMT(String MSVMT) {
        this.MSVMT = MSVMT == null ? null : MSVMT.trim();
    }
}