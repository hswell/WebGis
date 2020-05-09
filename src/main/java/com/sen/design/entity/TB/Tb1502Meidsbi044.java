package com.sen.design.entity.TB;

import java.math.BigDecimal;
import java.util.Date;

public class Tb1502Meidsbi044 extends Tb1502Meidsbi044Key {
//    实际装机总容量(兆瓦)
//    机组台数(台)
//    泵型
//    排水设计前池水位(m)
//    排水设计后池水位(m)
//    泵池底板高程(m)
//    设计排水流量(m3/s)
//    实际排水流量(m3/s)
//    实际排水面积(公顷)
//    灌溉(引水)设计前池水位(m)
//    灌溉(引水)设计后池水位(m)
//    设计灌溉引水流量(m3/s)
//    实际灌溉引水流量(m3/s)
//    设计灌溉面积(公顷)
//    实际灌溉面积(公顷)
//    备注
//            流水号
//    发送标示位
//            备用字段
//    修改人
//            修改日期

    private BigDecimal DSINCP;

    private BigDecimal ACINCP;

    private Short UNNB;

    private String PMTP;

    private BigDecimal DDFWLV;

    private BigDecimal DDPWLV;

    private BigDecimal PMPNMTEL;

    private BigDecimal DSDRFL;

    private BigDecimal AVDRFL;

    private Integer ACDRAR;

    private BigDecimal IDDFWLV;

    private BigDecimal IDDPWLV;

    private Integer DSIRDRFL;

    private Integer AXIRDRFL;

    private Integer DSIRAR;

    private Integer ACIRAR;

    private String RM;

    private String ATID;

    private String SDFL;

    private String RMA;

    private String MDPS;

    private Date MDDT;

    private String JSCSIZE;

    private String CSCSIZE;

    private String QCSIZE;

    private BigDecimal MAXYC;

    public Tb1502Meidsbi044(String ENNMCD, Date INFNDT, BigDecimal DSINCP, BigDecimal ACINCP, Short UNNB, String PMTP, BigDecimal DDFWLV, BigDecimal DDPWLV, BigDecimal PMPNMTEL, BigDecimal DSDRFL, BigDecimal AVDRFL, Integer ACDRAR, BigDecimal IDDFWLV, BigDecimal IDDPWLV, Integer DSIRDRFL, Integer AXIRDRFL, Integer DSIRAR, Integer ACIRAR, String RM, String ATID, String SDFL, String RMA, String MDPS, Date MDDT, String JSCSIZE, String CSCSIZE, String QCSIZE, BigDecimal MAXYC) {
        super(ENNMCD, INFNDT);
        this.DSINCP = DSINCP;
        this.ACINCP = ACINCP;
        this.UNNB = UNNB;
        this.PMTP = PMTP;
        this.DDFWLV = DDFWLV;
        this.DDPWLV = DDPWLV;
        this.PMPNMTEL = PMPNMTEL;
        this.DSDRFL = DSDRFL;
        this.AVDRFL = AVDRFL;
        this.ACDRAR = ACDRAR;
        this.IDDFWLV = IDDFWLV;
        this.IDDPWLV = IDDPWLV;
        this.DSIRDRFL = DSIRDRFL;
        this.AXIRDRFL = AXIRDRFL;
        this.DSIRAR = DSIRAR;
        this.ACIRAR = ACIRAR;
        this.RM = RM;
        this.ATID = ATID;
        this.SDFL = SDFL;
        this.RMA = RMA;
        this.MDPS = MDPS;
        this.MDDT = MDDT;
        this.JSCSIZE = JSCSIZE;
        this.CSCSIZE = CSCSIZE;
        this.QCSIZE = QCSIZE;
        this.MAXYC = MAXYC;
    }

    public Tb1502Meidsbi044() {
        super();
    }

    public BigDecimal getDSINCP() {
        return DSINCP;
    }

    public void setDSINCP(BigDecimal DSINCP) {
        this.DSINCP = DSINCP;
    }

    public BigDecimal getACINCP() {
        return ACINCP;
    }

    public void setACINCP(BigDecimal ACINCP) {
        this.ACINCP = ACINCP;
    }

    public Short getUNNB() {
        return UNNB;
    }

    public void setUNNB(Short UNNB) {
        this.UNNB = UNNB;
    }

    public String getPMTP() {
        return PMTP;
    }

    public void setPMTP(String PMTP) {
        this.PMTP = PMTP == null ? null : PMTP.trim();
    }

    public BigDecimal getDDFWLV() {
        return DDFWLV;
    }

    public void setDDFWLV(BigDecimal DDFWLV) {
        this.DDFWLV = DDFWLV;
    }

    public BigDecimal getDDPWLV() {
        return DDPWLV;
    }

    public void setDDPWLV(BigDecimal DDPWLV) {
        this.DDPWLV = DDPWLV;
    }

    public BigDecimal getPMPNMTEL() {
        return PMPNMTEL;
    }

    public void setPMPNMTEL(BigDecimal PMPNMTEL) {
        this.PMPNMTEL = PMPNMTEL;
    }

    public BigDecimal getDSDRFL() {
        return DSDRFL;
    }

    public void setDSDRFL(BigDecimal DSDRFL) {
        this.DSDRFL = DSDRFL;
    }

    public BigDecimal getAVDRFL() {
        return AVDRFL;
    }

    public void setAVDRFL(BigDecimal AVDRFL) {
        this.AVDRFL = AVDRFL;
    }

    public Integer getACDRAR() {
        return ACDRAR;
    }

    public void setACDRAR(Integer ACDRAR) {
        this.ACDRAR = ACDRAR;
    }

    public BigDecimal getIDDFWLV() {
        return IDDFWLV;
    }

    public void setIDDFWLV(BigDecimal IDDFWLV) {
        this.IDDFWLV = IDDFWLV;
    }

    public BigDecimal getIDDPWLV() {
        return IDDPWLV;
    }

    public void setIDDPWLV(BigDecimal IDDPWLV) {
        this.IDDPWLV = IDDPWLV;
    }

    public Integer getDSIRDRFL() {
        return DSIRDRFL;
    }

    public void setDSIRDRFL(Integer DSIRDRFL) {
        this.DSIRDRFL = DSIRDRFL;
    }

    public Integer getAXIRDRFL() {
        return AXIRDRFL;
    }

    public void setAXIRDRFL(Integer AXIRDRFL) {
        this.AXIRDRFL = AXIRDRFL;
    }

    public Integer getDSIRAR() {
        return DSIRAR;
    }

    public void setDSIRAR(Integer DSIRAR) {
        this.DSIRAR = DSIRAR;
    }

    public Integer getACIRAR() {
        return ACIRAR;
    }

    public void setACIRAR(Integer ACIRAR) {
        this.ACIRAR = ACIRAR;
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

    public String getJSCSIZE() {
        return JSCSIZE;
    }

    public void setJSCSIZE(String JSCSIZE) {
        this.JSCSIZE = JSCSIZE == null ? null : JSCSIZE.trim();
    }

    public String getCSCSIZE() {
        return CSCSIZE;
    }

    public void setCSCSIZE(String CSCSIZE) {
        this.CSCSIZE = CSCSIZE == null ? null : CSCSIZE.trim();
    }

    public String getQCSIZE() {
        return QCSIZE;
    }

    public void setQCSIZE(String QCSIZE) {
        this.QCSIZE = QCSIZE == null ? null : QCSIZE.trim();
    }

    public BigDecimal getMAXYC() {
        return MAXYC;
    }

    public void setMAXYC(BigDecimal MAXYC) {
        this.MAXYC = MAXYC;
    }
}