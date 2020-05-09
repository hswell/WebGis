package com.sen.design.entity.DseST;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

public class DseStRiverE {
    private String STCD;

    //TJSTATUS	统计标志 0 资料整编（不允许修改），1系统自动统计
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date TM;

    private BigDecimal z;

    private BigDecimal q;

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
}
