package com.sen.design.entity;

import java.math.BigDecimal;

public class AdCdB {
    private String ADCD;

    private String ADNM;

    private BigDecimal LGTD;

    private BigDecimal LTTD;

    private String AREACD;

    public AdCdB(String ADCD, String ADNM, BigDecimal LGTD, BigDecimal LTTD, String AREACD) {
        this.ADCD = ADCD;
        this.ADNM = ADNM;
        this.LGTD = LGTD;
        this.LTTD = LTTD;
        this.AREACD = AREACD;
    }

    public AdCdB() {
        super();
    }

    public String getADCD() {
        return ADCD;
    }

    public void setADCD(String ADCD) {
        this.ADCD = ADCD == null ? null : ADCD.trim();
    }

    public String getADNM() {
        return ADNM;
    }

    public void setADNM(String ADNM) {
        this.ADNM = ADNM == null ? null : ADNM.trim();
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

    public String getAREACD() {
        return AREACD;
    }

    public void setAREACD(String AREACD) {
        this.AREACD = AREACD == null ? null : AREACD.trim();
    }
}