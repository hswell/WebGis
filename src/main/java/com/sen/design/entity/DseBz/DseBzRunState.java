package com.sen.design.entity.DseBz;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class DseBzRunState {

    private BigDecimal FOREBAYZ;
    //前池水位
    private Short STATE;
    //泵站状态1-开，0-关
    private BigDecimal NSW;
    //泵站内江水位(米)

    private BigDecimal WSW;
    //泵站外江水位(米)
    private String STCD;
    //测站编号
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date TM;
    //采集时间

    public BigDecimal getFOREBAYZ() {
        return FOREBAYZ;
    }

    public void setFOREBAYZ(BigDecimal FOREBAYZ) {
        this.FOREBAYZ = FOREBAYZ;
    }

    public Short getSTATE() {
        return STATE;
    }

    public void setSTATE(Short STATE) {
        this.STATE = STATE;
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
}
