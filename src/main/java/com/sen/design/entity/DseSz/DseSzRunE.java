package com.sen.design.entity.DseSz;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class DseSzRunE {
    private String STCD;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date TM;


    private String n1;

    private String n2;

    private String n3;

    private String n4;

    private String n5;

    private String n6;

    public String getN6() {
        return n6;
    }

    public void setN6(String n6) {
        this.n6 = n6;
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

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    public String getN5() {
        return n5;
    }

    public void setN5(String n5) {
        this.n5 = n5;
    }


}
