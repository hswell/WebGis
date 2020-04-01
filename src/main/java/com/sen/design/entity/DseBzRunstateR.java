package com.sen.design.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DseBzRunstateR extends DseBzRunstateRKey {
    //2.5泵站开关机统计
    private BigDecimal FOREBAYZ;

    private Short n1;

    private Short n2;

    private Short n3;

    private Short n4;

    private Short n5;

    private Short n6;

    private Short n7;

    private Short n8;

    private Short n9;

    private Short n10;

    private Short n11;

    private Short n12;

    private Short STATE;

    private BigDecimal NSW;

    private BigDecimal WSW;

    public DseBzRunstateR(String STCD, Date TM, BigDecimal FOREBAYZ, Short n1, Short n2, Short n3, Short n4, Short n5, Short n6, Short n7, Short n8, Short n9, Short n10, Short n11, Short n12, Short STATE, BigDecimal NSW, BigDecimal WSW) {
        super(STCD, TM);
        this.FOREBAYZ = FOREBAYZ;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.n7 = n7;
        this.n8 = n8;
        this.n9 = n9;
        this.n10 = n10;
        this.n11 = n11;
        this.n12 = n12;
        this.STATE = STATE;
        this.NSW = NSW;
        this.WSW = WSW;
    }

    public DseBzRunstateR() {
        super();
    }

    public BigDecimal getFOREBAYZ() {
        return FOREBAYZ;
    }

    public void setFOREBAYZ(BigDecimal FOREBAYZ) {
        this.FOREBAYZ = FOREBAYZ;
    }

    public Short getN1() {
        return n1;
    }

    public void setN1(Short n1) {
        this.n1 = n1;
    }

    public Short getN2() {
        return n2;
    }

    public void setN2(Short n2) {
        this.n2 = n2;
    }

    public Short getN3() {
        return n3;
    }

    public void setN3(Short n3) {
        this.n3 = n3;
    }

    public Short getN4() {
        return n4;
    }

    public void setN4(Short n4) {
        this.n4 = n4;
    }

    public Short getN5() {
        return n5;
    }

    public void setN5(Short n5) {
        this.n5 = n5;
    }

    public Short getN6() {
        return n6;
    }

    public void setN6(Short n6) {
        this.n6 = n6;
    }

    public Short getN7() {
        return n7;
    }

    public void setN7(Short n7) {
        this.n7 = n7;
    }

    public Short getN8() {
        return n8;
    }

    public void setN8(Short n8) {
        this.n8 = n8;
    }

    public Short getN9() {
        return n9;
    }

    public void setN9(Short n9) {
        this.n9 = n9;
    }

    public Short getN10() {
        return n10;
    }

    public void setN10(Short n10) {
        this.n10 = n10;
    }

    public Short getN11() {
        return n11;
    }

    public void setN11(Short n11) {
        this.n11 = n11;
    }

    public Short getN12() {
        return n12;
    }

    public void setN12(Short n12) {
        this.n12 = n12;
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
}