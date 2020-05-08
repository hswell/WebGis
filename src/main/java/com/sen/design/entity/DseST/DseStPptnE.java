package com.sen.design.entity.DseST;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class DseStPptnE {
    private String STCD;
    //测站编码
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date TM;
    private BigDecimal DRP;

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

    public BigDecimal getDRP() {
        return DRP;
    }

    public void setDRP(BigDecimal DRP) {
        this.DRP = DRP;
    }
}
