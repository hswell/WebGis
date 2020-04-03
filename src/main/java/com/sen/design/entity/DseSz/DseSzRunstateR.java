package com.sen.design.entity.DseSz;

import java.math.BigDecimal;
import java.util.Date;

public class DseSzRunstateR extends DseSzRunstateRKey {
    //3.10水闸开关机统计表
    private String STATE;

    private String n1;

    private String n2;

    private String n3;

    private String n4;

    private String n5;

    private String n6;

    private String n7;

    private String n8;

    private String n9;

    private BigDecimal IN_WATER;

    private BigDecimal OUT_WATER;

    public DseSzRunstateR(String STCD, Date TM, String STATE, String n1, String n2, String n3, String n4, String n5, String n6, String n7, String n8, String n9, BigDecimal IN_WATER, BigDecimal OUT_WATER) {
        super(STCD, TM);
        this.STATE = STATE;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.n7 = n7;
        this.n8 = n8;
        this.n9 = n9;
        this.IN_WATER = IN_WATER;
        this.OUT_WATER = OUT_WATER;
    }

    public DseSzRunstateR() {
        super();
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE == null ? null : STATE.trim();
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1 == null ? null : n1.trim();
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2 == null ? null : n2.trim();
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3 == null ? null : n3.trim();
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4 == null ? null : n4.trim();
    }

    public String getN5() {
        return n5;
    }

    public void setN5(String n5) {
        this.n5 = n5 == null ? null : n5.trim();
    }

    public String getN6() {
        return n6;
    }

    public void setN6(String n6) {
        this.n6 = n6 == null ? null : n6.trim();
    }

    public String getN7() {
        return n7;
    }

    public void setN7(String n7) {
        this.n7 = n7 == null ? null : n7.trim();
    }

    public String getN8() {
        return n8;
    }

    public void setN8(String n8) {
        this.n8 = n8 == null ? null : n8.trim();
    }

    public String getN9() {
        return n9;
    }

    public void setN9(String n9) {
        this.n9 = n9 == null ? null : n9.trim();
    }

    public BigDecimal getIN_WATER() {
        return IN_WATER;
    }

    public void setIN_WATER(BigDecimal IN_WATER) {
        this.IN_WATER = IN_WATER;
    }

    public BigDecimal getOUT_WATER() {
        return OUT_WATER;
    }

    public void setOUT_WATER(BigDecimal OUT_WATER) {
        this.OUT_WATER = OUT_WATER;
    }
}