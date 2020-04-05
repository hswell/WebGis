package com.sen.design.entity.TB;

import java.util.Date;

public class Tb0901Slcmin044 extends Tb0901Slcmin044Key {
    //水闸一般信息表
    private String ADUNCD;
//    管理单位代码


    private String ADUNNM;
    //            管理单位名称

    private Date BLDT;
    //    建成日期

    private Date OPBGTM;
    //            开始运行日期

    private String GTCL;
    //    水闸级别(1:大型,2:中型,3:小型)

    private String LVBSLV;
    //    水准基面

    private String DLBLP;
    //            假定水准基面位置

    private String DSIN;
    //    损坏情况

    private String ASTKBIN;
    //            加固改扩建情况

    private String RM;
    //    备注

    private String ATID;
    //            流水号

    private String SDFL;
    //    发送标示位

    private String RMA;
    //            备用字段

    private String MDPS;
    //    修改人

    private Date MDDT;
    //            修改日期

    private Short ZMNUM;
    //    闸门数量

    private String ISIMP;
    //    是否重点(1:是,0:否)

    private String ZM3DURL;
    //    闸门三维图纸路径

    public Tb0901Slcmin044(String ENNMCD, Date INFNDT, String ADUNCD, String ADUNNM, Date BLDT, Date OPBGTM, String GTCL, String LVBSLV, String DLBLP, String DSIN, String ASTKBIN, String RM, String ATID, String SDFL, String RMA, String MDPS, Date MDDT, Short ZMNUM, String ISIMP, String ZM3DURL) {
        super(ENNMCD, INFNDT);
        this.ADUNCD = ADUNCD;
        this.ADUNNM = ADUNNM;
        this.BLDT = BLDT;
        this.OPBGTM = OPBGTM;
        this.GTCL = GTCL;
        this.LVBSLV = LVBSLV;
        this.DLBLP = DLBLP;
        this.DSIN = DSIN;
        this.ASTKBIN = ASTKBIN;
        this.RM = RM;
        this.ATID = ATID;
        this.SDFL = SDFL;
        this.RMA = RMA;
        this.MDPS = MDPS;
        this.MDDT = MDDT;
        this.ZMNUM = ZMNUM;
        this.ISIMP = ISIMP;
        this.ZM3DURL = ZM3DURL;
    }

    public Tb0901Slcmin044() {
        super();
    }

    public String getADUNCD() {
        return ADUNCD;
    }

    public void setADUNCD(String ADUNCD) {
        this.ADUNCD = ADUNCD == null ? null : ADUNCD.trim();
    }

    public String getADUNNM() {
        return ADUNNM;
    }

    public void setADUNNM(String ADUNNM) {
        this.ADUNNM = ADUNNM == null ? null : ADUNNM.trim();
    }

    public Date getBLDT() {
        return BLDT;
    }

    public void setBLDT(Date BLDT) {
        this.BLDT = BLDT;
    }

    public Date getOPBGTM() {
        return OPBGTM;
    }

    public void setOPBGTM(Date OPBGTM) {
        this.OPBGTM = OPBGTM;
    }

    public String getGTCL() {
        return GTCL;
    }

    public void setGTCL(String GTCL) {
        this.GTCL = GTCL == null ? null : GTCL.trim();
    }

    public String getLVBSLV() {
        return LVBSLV;
    }

    public void setLVBSLV(String LVBSLV) {
        this.LVBSLV = LVBSLV == null ? null : LVBSLV.trim();
    }

    public String getDLBLP() {
        return DLBLP;
    }

    public void setDLBLP(String DLBLP) {
        this.DLBLP = DLBLP == null ? null : DLBLP.trim();
    }

    public String getDSIN() {
        return DSIN;
    }

    public void setDSIN(String DSIN) {
        this.DSIN = DSIN == null ? null : DSIN.trim();
    }

    public String getASTKBIN() {
        return ASTKBIN;
    }

    public void setASTKBIN(String ASTKBIN) {
        this.ASTKBIN = ASTKBIN == null ? null : ASTKBIN.trim();
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

    public Short getZMNUM() {
        return ZMNUM;
    }

    public void setZMNUM(Short ZMNUM) {
        this.ZMNUM = ZMNUM;
    }

    public String getISIMP() {
        return ISIMP;
    }

    public void setISIMP(String ISIMP) {
        this.ISIMP = ISIMP == null ? null : ISIMP.trim();
    }

    public String getZM3DURL() {
        return ZM3DURL;
    }

    public void setZM3DURL(String ZM3DURL) {
        this.ZM3DURL = ZM3DURL == null ? null : ZM3DURL.trim();
    }
}