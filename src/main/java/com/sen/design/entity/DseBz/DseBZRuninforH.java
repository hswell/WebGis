package com.sen.design.entity.DseBz;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class DseBZRuninforH {
    private String STCD;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date TM;
    private String AIRCREWNM;
    //机组编号
    private String AIRCREWSTATE;
    //机组状态


    private BigDecimal DSINCP;
    //装机容量DSINCP
    private String POWERACTIVE;
    private String DISTANCE;

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public Date getTM() {
        return TM;
    }

    public void setTM(Date TM) {
        this.TM = TM;
    }

    public String getAIRCREWNM() {
        return AIRCREWNM;
    }

    public void setAIRCREWNM(String AIRCREWNM) {
        this.AIRCREWNM = AIRCREWNM;
    }

    public String getAIRCREWSTATE() {
        return AIRCREWSTATE;
    }

    public void setAIRCREWSTATE(String AIRCREWSTATE) {
        this.AIRCREWSTATE = AIRCREWSTATE;
    }

    public BigDecimal getDSINCP() {
        return DSINCP;
    }

    public void setDSINCP(BigDecimal DSINCP) {
        this.DSINCP = DSINCP;
    }

    public String getPOWERACTIVE() {
        return POWERACTIVE;
    }

    public void setPOWERACTIVE(String POWERACTIVE) {
        this.POWERACTIVE = POWERACTIVE;
    }

    public String getDISTANCE() {
        return DISTANCE;
    }

    public void setDISTANCE(String DISTANCE) {
        this.DISTANCE = DISTANCE;
    }
}
