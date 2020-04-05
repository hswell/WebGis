package com.sen.design.entity.TB;

import java.util.Date;

public class Tb0902Slcnstrl044 extends Tb0902Slcnstrl044Key {
    private String GTCNSTCD;
    //   闸上控制站代码
    private String GDCSCD;
    //   闸下控制站代码
    private String RM;
    //    备注
    private String ATID;
    //    流水号
    private String SDFL;
    //   发送标示位
    private String RMA;
    //   备用字段
    private String MDPS;
    //   修改人
    private Date MDDT;
    //  修改日期
    public Tb0902Slcnstrl044(String ENNMCD, Date INFNDT, String GTCNSTCD, String GDCSCD, String RM, String ATID, String SDFL, String RMA, String MDPS, Date MDDT) {
        super(ENNMCD, INFNDT);
        this.GTCNSTCD = GTCNSTCD;
        this.GDCSCD = GDCSCD;
        this.RM = RM;
        this.ATID = ATID;
        this.SDFL = SDFL;
        this.RMA = RMA;
        this.MDPS = MDPS;
        this.MDDT = MDDT;
    }

    public Tb0902Slcnstrl044() {
        super();
    }

    public String getGTCNSTCD() {
        return GTCNSTCD;
    }

    public void setGTCNSTCD(String GTCNSTCD) {
        this.GTCNSTCD = GTCNSTCD == null ? null : GTCNSTCD.trim();
    }

    public String getGDCSCD() {
        return GDCSCD;
    }

    public void setGDCSCD(String GDCSCD) {
        this.GDCSCD = GDCSCD == null ? null : GDCSCD.trim();
    }

    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM == null ? null : RM.trim();
    }

    public String getATID() {
        return ATID;
    }

    public void setATID(String ATID) {
        this.ATID = ATID == null ? null : ATID.trim();
    }

    public String getSDFL() {
        return SDFL;
    }

    public void setSDFL(String SDFL) {
        this.SDFL = SDFL == null ? null : SDFL.trim();
    }

    public String getRMA() {
        return RMA;
    }

    public void setRMA(String RMA) {
        this.RMA = RMA == null ? null : RMA.trim();
    }

    public String getMDPS() {
        return MDPS;
    }

    public void setMDPS(String MDPS) {
        this.MDPS = MDPS == null ? null : MDPS.trim();
    }

    public Date getMDDT() {
        return MDDT;
    }

    public void setMDDT(Date MDDT) {
        this.MDDT = MDDT;
    }
}