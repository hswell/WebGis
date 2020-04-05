package com.sen.design.entity.SYS;

import java.util.Date;

public class SysUser {
    private Long USERID;

    private String LOGINID;

    private String UNAME;

    private String PWD;

    private Long DFORGID;

    private String DFTEL;

    private String SEX;

    private String VALID;

    private Long MODIFIER;

    private Date MODTIME;

    private String ISSYS;

    private String UTYPE;

    public SysUser(Long USERID, String LOGINID, String UNAME, String PWD, Long DFORGID, String DFTEL, String SEX, String VALID, Long MODIFIER, Date MODTIME, String ISSYS, String UTYPE) {
        this.USERID = USERID;
        this.LOGINID = LOGINID;
        this.UNAME = UNAME;
        this.PWD = PWD;
        this.DFORGID = DFORGID;
        this.DFTEL = DFTEL;
        this.SEX = SEX;
        this.VALID = VALID;
        this.MODIFIER = MODIFIER;
        this.MODTIME = MODTIME;
        this.ISSYS = ISSYS;
        this.UTYPE = UTYPE;
    }

    public SysUser() {
        super();
    }

    public Long getUSERID() {
        return USERID;
    }

    public void setUSERID(Long USERID) {
        this.USERID = USERID;
    }

    public String getLOGINID() {
        return LOGINID;
    }

    public void setLOGINID(String LOGINID) {
        this.LOGINID = LOGINID == null ? null : LOGINID.trim();
    }

    public String getUNAME() {
        return UNAME;
    }

    public void setUNAME(String UNAME) {
        this.UNAME = UNAME == null ? null : UNAME.trim();
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD == null ? null : PWD.trim();
    }

    public Long getDFORGID() {
        return DFORGID;
    }

    public void setDFORGID(Long DFORGID) {
        this.DFORGID = DFORGID;
    }

    public String getDFTEL() {
        return DFTEL;
    }

    public void setDFTEL(String DFTEL) {
        this.DFTEL = DFTEL == null ? null : DFTEL.trim();
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX == null ? null : SEX.trim();
    }

    public String getVALID() {
        return VALID;
    }

    public void setVALID(String VALID) {
        this.VALID = VALID == null ? null : VALID.trim();
    }

    public Long getMODIFIER() {
        return MODIFIER;
    }

    public void setMODIFIER(Long MODIFIER) {
        this.MODIFIER = MODIFIER;
    }

    public Date getMODTIME() {
        return MODTIME;
    }

    public void setMODTIME(Date MODTIME) {
        this.MODTIME = MODTIME;
    }

    public String getISSYS() {
        return ISSYS;
    }

    public void setISSYS(String ISSYS) {
        this.ISSYS = ISSYS == null ? null : ISSYS.trim();
    }

    public String getUTYPE() {
        return UTYPE;
    }

    public void setUTYPE(String UTYPE) {
        this.UTYPE = UTYPE == null ? null : UTYPE.trim();
    }
}