package com.sen.design.entity.DseBz;

import java.math.BigDecimal;
import java.util.Date;

public class DseBzRuninfoR extends DseBzRuninfoRKey {
    private String VOLTAGEA;

    private String VOLTAGEB;

    private String VOLTAGEC;

    private String ECA;

    private String ECB;

    private String ECC;

    private String POWERACTIVE;

    private String POWERREACTIVE;

    private String EDACTIVE;

    private String EDREACTIVE;

    private String POWERFACTOR;

    private String UPBUSHING;

    private String DOWNBUSHING;

    private String POWERBUSHING;

    private String STATORTEMPERATURE;

    private String AIRCREWSTATE;

    private String INSTANTANEOUSQ;

    private String COUNTQ;

    private BigDecimal FOREBAYZ;

    private String DISTANCE;

    private BigDecimal NSW;

    private BigDecimal WSW;

    public DseBzRuninfoR(String STCD, Date TM, String AIRCREWNM, String PIPENM, String VOLTAGEA, String VOLTAGEB, String VOLTAGEC, String ECA, String ECB, String ECC, String POWERACTIVE, String POWERREACTIVE, String EDACTIVE, String EDREACTIVE, String POWERFACTOR, String UPBUSHING, String DOWNBUSHING, String POWERBUSHING, String STATORTEMPERATURE, String AIRCREWSTATE, String INSTANTANEOUSQ, String COUNTQ, BigDecimal FOREBAYZ, String DISTANCE, BigDecimal NSW, BigDecimal WSW) {
        super(STCD, TM, AIRCREWNM, PIPENM);
        this.VOLTAGEA = VOLTAGEA;
        this.VOLTAGEB = VOLTAGEB;
        this.VOLTAGEC = VOLTAGEC;
        this.ECA = ECA;
        this.ECB = ECB;
        this.ECC = ECC;
        this.POWERACTIVE = POWERACTIVE;
        this.POWERREACTIVE = POWERREACTIVE;
        this.EDACTIVE = EDACTIVE;
        this.EDREACTIVE = EDREACTIVE;
        this.POWERFACTOR = POWERFACTOR;
        this.UPBUSHING = UPBUSHING;
        this.DOWNBUSHING = DOWNBUSHING;
        this.POWERBUSHING = POWERBUSHING;
        this.STATORTEMPERATURE = STATORTEMPERATURE;
        this.AIRCREWSTATE = AIRCREWSTATE;
        this.INSTANTANEOUSQ = INSTANTANEOUSQ;
        this.COUNTQ = COUNTQ;
        this.FOREBAYZ = FOREBAYZ;
        this.DISTANCE = DISTANCE;
        this.NSW = NSW;
        this.WSW = WSW;
    }

    public DseBzRuninfoR() {
        super();
    }

    public String getVOLTAGEA() {
        return VOLTAGEA;
    }

    public void setVOLTAGEA(String VOLTAGEA) {
        this.VOLTAGEA = VOLTAGEA == null ? null : VOLTAGEA.trim();
    }

    public String getVOLTAGEB() {
        return VOLTAGEB;
    }

    public void setVOLTAGEB(String VOLTAGEB) {
        this.VOLTAGEB = VOLTAGEB == null ? null : VOLTAGEB.trim();
    }

    public String getVOLTAGEC() {
        return VOLTAGEC;
    }

    public void setVOLTAGEC(String VOLTAGEC) {
        this.VOLTAGEC = VOLTAGEC == null ? null : VOLTAGEC.trim();
    }

    public String getECA() {
        return ECA;
    }

    public void setECA(String ECA) {
        this.ECA = ECA == null ? null : ECA.trim();
    }

    public String getECB() {
        return ECB;
    }

    public void setECB(String ECB) {
        this.ECB = ECB == null ? null : ECB.trim();
    }

    public String getECC() {
        return ECC;
    }

    public void setECC(String ECC) {
        this.ECC = ECC == null ? null : ECC.trim();
    }

    public String getPOWERACTIVE() {
        return POWERACTIVE;
    }

    public void setPOWERACTIVE(String POWERACTIVE) {
        this.POWERACTIVE = POWERACTIVE == null ? null : POWERACTIVE.trim();
    }

    public String getPOWERREACTIVE() {
        return POWERREACTIVE;
    }

    public void setPOWERREACTIVE(String POWERREACTIVE) {
        this.POWERREACTIVE = POWERREACTIVE == null ? null : POWERREACTIVE.trim();
    }

    public String getEDACTIVE() {
        return EDACTIVE;
    }

    public void setEDACTIVE(String EDACTIVE) {
        this.EDACTIVE = EDACTIVE == null ? null : EDACTIVE.trim();
    }

    public String getEDREACTIVE() {
        return EDREACTIVE;
    }

    public void setEDREACTIVE(String EDREACTIVE) {
        this.EDREACTIVE = EDREACTIVE == null ? null : EDREACTIVE.trim();
    }

    public String getPOWERFACTOR() {
        return POWERFACTOR;
    }

    public void setPOWERFACTOR(String POWERFACTOR) {
        this.POWERFACTOR = POWERFACTOR == null ? null : POWERFACTOR.trim();
    }

    public String getUPBUSHING() {
        return UPBUSHING;
    }

    public void setUPBUSHING(String UPBUSHING) {
        this.UPBUSHING = UPBUSHING == null ? null : UPBUSHING.trim();
    }

    public String getDOWNBUSHING() {
        return DOWNBUSHING;
    }

    public void setDOWNBUSHING(String DOWNBUSHING) {
        this.DOWNBUSHING = DOWNBUSHING == null ? null : DOWNBUSHING.trim();
    }

    public String getPOWERBUSHING() {
        return POWERBUSHING;
    }

    public void setPOWERBUSHING(String POWERBUSHING) {
        this.POWERBUSHING = POWERBUSHING == null ? null : POWERBUSHING.trim();
    }

    public String getSTATORTEMPERATURE() {
        return STATORTEMPERATURE;
    }

    public void setSTATORTEMPERATURE(String STATORTEMPERATURE) {
        this.STATORTEMPERATURE = STATORTEMPERATURE == null ? null : STATORTEMPERATURE.trim();
    }

    public String getAIRCREWSTATE() {
        return AIRCREWSTATE;
    }

    public void setAIRCREWSTATE(String AIRCREWSTATE) {
        this.AIRCREWSTATE = AIRCREWSTATE == null ? null : AIRCREWSTATE.trim();
    }

    public String getINSTANTANEOUSQ() {
        return INSTANTANEOUSQ;
    }

    public void setINSTANTANEOUSQ(String INSTANTANEOUSQ) {
        this.INSTANTANEOUSQ = INSTANTANEOUSQ == null ? null : INSTANTANEOUSQ.trim();
    }

    public String getCOUNTQ() {
        return COUNTQ;
    }

    public void setCOUNTQ(String COUNTQ) {
        this.COUNTQ = COUNTQ == null ? null : COUNTQ.trim();
    }

    public BigDecimal getFOREBAYZ() {
        return FOREBAYZ;
    }

    public void setFOREBAYZ(BigDecimal FOREBAYZ) {
        this.FOREBAYZ = FOREBAYZ;
    }

    public String getDISTANCE() {
        return DISTANCE;
    }

    public void setDISTANCE(String DISTANCE) {
        this.DISTANCE = DISTANCE == null ? null : DISTANCE.trim();
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
}