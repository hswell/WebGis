package com.sen.design.entity.DseBz;


import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class DseBZRuninforE {
    private String STCD;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date TM;
    private String AIRCREWNM;
    //机组编号
    private String AIRCREWSTATE;
    //机组状态
    private BigDecimal NSW;


    private BigDecimal WSW;

    private BigDecimal DSINCP;
    private BigDecimal AVDRFL;
    //装机容量DSINCP
    //AVDRFL
    private String INSTANTANEOUSQ;
    //瞬时流量

    public BigDecimal getAVDRFL() {
        return AVDRFL;
    }

    public void setAVDRFL(BigDecimal AVDRFL) {
        this.AVDRFL = AVDRFL;
    }

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

    public BigDecimal getDSINCP() {
        return DSINCP;
    }

    public void setDSINCP(BigDecimal DSINCP) {
        this.DSINCP = DSINCP;
    }



    public String getINSTANTANEOUSQ() {
        return INSTANTANEOUSQ;
    }

    public void setINSTANTANEOUSQ(String INSTANTANEOUSQ) {
        this.INSTANTANEOUSQ = INSTANTANEOUSQ;
    }
}
