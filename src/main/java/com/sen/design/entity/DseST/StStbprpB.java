package com.sen.design.entity.DseST;

import java.math.BigDecimal;
import java.util.Date;

public class StStbprpB {
    private String STCD;

    private String STNM;

    private String RVNM;

    private String HNNM;

    private String BSNM;

    private BigDecimal LGTD;

    private BigDecimal LTTD;

    private String STLC;

    private String ADDVCD;

    private String DTMNM;

    private BigDecimal DTMEL;

    private BigDecimal DTPR;

    private String STTP;

    private String FRGRD;

    private String ESSTYM;

    private String BGFRYM;

    private String ATCUNIT;

    private String ADMAUTH;

    private String LOCALITY;

    private String STBK;

    private Short STAZT;

    private BigDecimal DSTRVM;

    private Integer DRNA;

    private String PHCD;

    private String USFL;

    private String COMMENTS;

    private Date MODITIME;

    private BigDecimal MDBZ;

    private BigDecimal MDPR;

    private Short DFRTMS;

    private String FRITM;

    private String EDFRYM;

    private String REM_GD;

    private String OGID;

    private Short VLFL;

    private String ATID;

    private String SDFL;

    private String RMA;

    private String MDPS;

    private Date MDDT;

    private Integer STINDEX;

    private String STAREA;

    private String STLEVEL;

    private String CODE;

    private String STPQ;

    private String STZG;

    private String STXZQ;

    private Short STHDAY;

    private Integer STLEV;

    private Integer CZLEV;

    private String CACD;

    private String AREACD;

    private String TIPS;

    public StStbprpB(String STCD, String STNM, String RVNM, String HNNM, String BSNM, BigDecimal LGTD, BigDecimal LTTD, String STLC, String ADDVCD, String DTMNM, BigDecimal DTMEL, BigDecimal DTPR, String STTP, String FRGRD, String ESSTYM, String BGFRYM, String ATCUNIT, String ADMAUTH, String LOCALITY, String STBK, Short STAZT, BigDecimal DSTRVM, Integer DRNA, String PHCD, String USFL, String COMMENTS, Date MODITIME, BigDecimal MDBZ, BigDecimal MDPR, Short DFRTMS, String FRITM, String EDFRYM, String REM_GD, String OGID, Short VLFL, String ATID, String SDFL, String RMA, String MDPS, Date MDDT, Integer STINDEX, String STAREA, String STLEVEL, String CODE, String STPQ, String STZG, String STXZQ, Short STHDAY, Integer STLEV, Integer CZLEV, String CACD, String AREACD, String TIPS) {
        this.STCD = STCD;
        this.STNM = STNM;
        this.RVNM = RVNM;
        this.HNNM = HNNM;
        this.BSNM = BSNM;
        this.LGTD = LGTD;
        this.LTTD = LTTD;
        this.STLC = STLC;
        this.ADDVCD = ADDVCD;
        this.DTMNM = DTMNM;
        this.DTMEL = DTMEL;
        this.DTPR = DTPR;
        this.STTP = STTP;
        this.FRGRD = FRGRD;
        this.ESSTYM = ESSTYM;
        this.BGFRYM = BGFRYM;
        this.ATCUNIT = ATCUNIT;
        this.ADMAUTH = ADMAUTH;
        this.LOCALITY = LOCALITY;
        this.STBK = STBK;
        this.STAZT = STAZT;
        this.DSTRVM = DSTRVM;
        this.DRNA = DRNA;
        this.PHCD = PHCD;
        this.USFL = USFL;
        this.COMMENTS = COMMENTS;
        this.MODITIME = MODITIME;
        this.MDBZ = MDBZ;
        this.MDPR = MDPR;
        this.DFRTMS = DFRTMS;
        this.FRITM = FRITM;
        this.EDFRYM = EDFRYM;
        this.REM_GD = REM_GD;
        this.OGID = OGID;
        this.VLFL = VLFL;
        this.ATID = ATID;
        this.SDFL = SDFL;
        this.RMA = RMA;
        this.MDPS = MDPS;
        this.MDDT = MDDT;
        this.STINDEX = STINDEX;
        this.STAREA = STAREA;
        this.STLEVEL = STLEVEL;
        this.CODE = CODE;
        this.STPQ = STPQ;
        this.STZG = STZG;
        this.STXZQ = STXZQ;
        this.STHDAY = STHDAY;
        this.STLEV = STLEV;
        this.CZLEV = CZLEV;
        this.CACD = CACD;
        this.AREACD = AREACD;
        this.TIPS = TIPS;
    }

    public StStbprpB() {
        super();
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM == null ? null : STNM.trim();
    }

    public String getRVNM() {
        return RVNM;
    }

    public void setRVNM(String RVNM) {
        this.RVNM = RVNM == null ? null : RVNM.trim();
    }

    public String getHNNM() {
        return HNNM;
    }

    public void setHNNM(String HNNM) {
        this.HNNM = HNNM == null ? null : HNNM.trim();
    }

    public String getBSNM() {
        return BSNM;
    }

    public void setBSNM(String BSNM) {
        this.BSNM = BSNM == null ? null : BSNM.trim();
    }

    public BigDecimal getLGTD() {
        return LGTD;
    }

    public void setLGTD(BigDecimal LGTD) {
        this.LGTD = LGTD;
    }

    public BigDecimal getLTTD() {
        return LTTD;
    }

    public void setLTTD(BigDecimal LTTD) {
        this.LTTD = LTTD;
    }

    public String getSTLC() {
        return STLC;
    }

    public void setSTLC(String STLC) {
        this.STLC = STLC == null ? null : STLC.trim();
    }

    public String getADDVCD() {
        return ADDVCD;
    }

    public void setADDVCD(String ADDVCD) {
        this.ADDVCD = ADDVCD == null ? null : ADDVCD.trim();
    }

    public String getDTMNM() {
        return DTMNM;
    }

    public void setDTMNM(String DTMNM) {
        this.DTMNM = DTMNM == null ? null : DTMNM.trim();
    }

    public BigDecimal getDTMEL() {
        return DTMEL;
    }

    public void setDTMEL(BigDecimal DTMEL) {
        this.DTMEL = DTMEL;
    }

    public BigDecimal getDTPR() {
        return DTPR;
    }

    public void setDTPR(BigDecimal DTPR) {
        this.DTPR = DTPR;
    }

    public String getSTTP() {
        return STTP;
    }

    public void setSTTP(String STTP) {
        this.STTP = STTP == null ? null : STTP.trim();
    }

    public String getFRGRD() {
        return FRGRD;
    }

    public void setFRGRD(String FRGRD) {
        this.FRGRD = FRGRD == null ? null : FRGRD.trim();
    }

    public String getESSTYM() {
        return ESSTYM;
    }

    public void setESSTYM(String ESSTYM) {
        this.ESSTYM = ESSTYM == null ? null : ESSTYM.trim();
    }

    public String getBGFRYM() {
        return BGFRYM;
    }

    public void setBGFRYM(String BGFRYM) {
        this.BGFRYM = BGFRYM == null ? null : BGFRYM.trim();
    }

    public String getATCUNIT() {
        return ATCUNIT;
    }

    public void setATCUNIT(String ATCUNIT) {
        this.ATCUNIT = ATCUNIT == null ? null : ATCUNIT.trim();
    }

    public String getADMAUTH() {
        return ADMAUTH;
    }

    public void setADMAUTH(String ADMAUTH) {
        this.ADMAUTH = ADMAUTH == null ? null : ADMAUTH.trim();
    }

    public String getLOCALITY() {
        return LOCALITY;
    }

    public void setLOCALITY(String LOCALITY) {
        this.LOCALITY = LOCALITY == null ? null : LOCALITY.trim();
    }

    public String getSTBK() {
        return STBK;
    }

    public void setSTBK(String STBK) {
        this.STBK = STBK == null ? null : STBK.trim();
    }

    public Short getSTAZT() {
        return STAZT;
    }

    public void setSTAZT(Short STAZT) {
        this.STAZT = STAZT;
    }

    public BigDecimal getDSTRVM() {
        return DSTRVM;
    }

    public void setDSTRVM(BigDecimal DSTRVM) {
        this.DSTRVM = DSTRVM;
    }

    public Integer getDRNA() {
        return DRNA;
    }

    public void setDRNA(Integer DRNA) {
        this.DRNA = DRNA;
    }

    public String getPHCD() {
        return PHCD;
    }

    public void setPHCD(String PHCD) {
        this.PHCD = PHCD == null ? null : PHCD.trim();
    }

    public String getUSFL() {
        return USFL;
    }

    public void setUSFL(String USFL) {
        this.USFL = USFL == null ? null : USFL.trim();
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS == null ? null : COMMENTS.trim();
    }

    public Date getMODITIME() {
        return MODITIME;
    }

    public void setMODITIME(Date MODITIME) {
        this.MODITIME = MODITIME;
    }

    public BigDecimal getMDBZ() {
        return MDBZ;
    }

    public void setMDBZ(BigDecimal MDBZ) {
        this.MDBZ = MDBZ;
    }

    public BigDecimal getMDPR() {
        return MDPR;
    }

    public void setMDPR(BigDecimal MDPR) {
        this.MDPR = MDPR;
    }

    public Short getDFRTMS() {
        return DFRTMS;
    }

    public void setDFRTMS(Short DFRTMS) {
        this.DFRTMS = DFRTMS;
    }

    public String getFRITM() {
        return FRITM;
    }

    public void setFRITM(String FRITM) {
        this.FRITM = FRITM == null ? null : FRITM.trim();
    }

    public String getEDFRYM() {
        return EDFRYM;
    }

    public void setEDFRYM(String EDFRYM) {
        this.EDFRYM = EDFRYM == null ? null : EDFRYM.trim();
    }

    public String getREM_GD() {
        return REM_GD;
    }

    public void setREM_GD(String REM_GD) {
        this.REM_GD = REM_GD == null ? null : REM_GD.trim();
    }

    public String getOGID() {
        return OGID;
    }

    public void setOGID(String OGID) {
        this.OGID = OGID == null ? null : OGID.trim();
    }

    public Short getVLFL() {
        return VLFL;
    }

    public void setVLFL(Short VLFL) {
        this.VLFL = VLFL;
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

    public Integer getSTINDEX() {
        return STINDEX;
    }

    public void setSTINDEX(Integer STINDEX) {
        this.STINDEX = STINDEX;
    }

    public String getSTAREA() {
        return STAREA;
    }

    public void setSTAREA(String STAREA) {
        this.STAREA = STAREA == null ? null : STAREA.trim();
    }

    public String getSTLEVEL() {
        return STLEVEL;
    }

    public void setSTLEVEL(String STLEVEL) {
        this.STLEVEL = STLEVEL == null ? null : STLEVEL.trim();
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE == null ? null : CODE.trim();
    }

    public String getSTPQ() {
        return STPQ;
    }

    public void setSTPQ(String STPQ) {
        this.STPQ = STPQ == null ? null : STPQ.trim();
    }

    public String getSTZG() {
        return STZG;
    }

    public void setSTZG(String STZG) {
        this.STZG = STZG == null ? null : STZG.trim();
    }

    public String getSTXZQ() {
        return STXZQ;
    }

    public void setSTXZQ(String STXZQ) {
        this.STXZQ = STXZQ == null ? null : STXZQ.trim();
    }

    public Short getSTHDAY() {
        return STHDAY;
    }

    public void setSTHDAY(Short STHDAY) {
        this.STHDAY = STHDAY;
    }

    public Integer getSTLEV() {
        return STLEV;
    }

    public void setSTLEV(Integer STLEV) {
        this.STLEV = STLEV;
    }

    public Integer getCZLEV() {
        return CZLEV;
    }

    public void setCZLEV(Integer CZLEV) {
        this.CZLEV = CZLEV;
    }

    public String getCACD() {
        return CACD;
    }

    public void setCACD(String CACD) {
        this.CACD = CACD == null ? null : CACD.trim();
    }

    public String getAREACD() {
        return AREACD;
    }

    public void setAREACD(String AREACD) {
        this.AREACD = AREACD == null ? null : AREACD.trim();
    }

    public String getTIPS() {
        return TIPS;
    }

    public void setTIPS(String TIPS) {
        this.TIPS = TIPS == null ? null : TIPS.trim();
    }
}