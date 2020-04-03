package com.sen.design.entity.DseBz;

import java.math.BigDecimal;
import java.util.Date;

public class DseBzRuninfoReal extends DseBzRuninfoRealKey {
    //3.2泵站运行信息实时表
    private Date TM;

    //采集时间

    private String VOLTAGEA;
    //A相电压单位((KV))
    private String VOLTAGEB;
    //B相电压单位((KV))
    private String VOLTAGEC;
    //C相电压单位((KV))
    private String ECA;
    //A相电流单位((A))
    private String ECB;
    //B相电流单位((A))
    private String ECC;
    //C相电流单位((A))
    private String POWERACTIVE;
    //有功功率单位((KW))
    private String POWERREACTIVE;
    //无功功率单位((KVar))
    private String EDACTIVE;
    //有功电度单位((KWh))
    private String EDREACTIVE;
    //无功电度单位((KWh))

    private String POWERFACTOR;
    //功率因数

    private String UPBUSHING;
    //上导轴瓦单位((℃))

    private String DOWNBUSHING;
    //下导轴瓦单位((℃))

    private String POWERBUSHING;
    //推力轴瓦单位((℃))

    private String STATORTEMPERATURE;
    //定子温度单位((℃))

    private String AIRCREWSTATE;
    //机组状态

    private String INSTANTANEOUSQ;
    //瞬时流量单位(立方米/秒)

    private String COUNTQ;
    //累计水量单位(立方米)

    private BigDecimal FOREBAYZ;
    //前池水位单位((米))

    private String DISTANCE;
    //扬程单位((米))

    private BigDecimal NSW;
    //泵站内江水位(米)
    private BigDecimal WSW;
    //泵站外江水位(米)

    public DseBzRuninfoReal(String STCD, String AIRCREWNM, String PIPENM, Date TM, String VOLTAGEA, String VOLTAGEB, String VOLTAGEC, String ECA, String ECB, String ECC, String POWERACTIVE, String POWERREACTIVE, String EDACTIVE, String EDREACTIVE, String POWERFACTOR, String UPBUSHING, String DOWNBUSHING, String POWERBUSHING, String STATORTEMPERATURE, String AIRCREWSTATE, String INSTANTANEOUSQ, String COUNTQ, BigDecimal FOREBAYZ, String DISTANCE, BigDecimal NSW, BigDecimal WSW) {
        super(STCD, AIRCREWNM, PIPENM);
        this.TM = TM;
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

    public DseBzRuninfoReal() {
        super();
    }

    public Date getTM() {
        return TM;
    }

    public void setTM(Date TM) {
        this.TM = TM;
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