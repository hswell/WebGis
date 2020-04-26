package com.sen.design.config;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class QSTM {
    //站台名
    private String STCD;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date startTM;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date endTM;

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public Date getStartTM() {
        return startTM;
    }

    public void setStartTM(Date startTM) {
        this.startTM = startTM;
    }

    public Date getEndTM() {
        return endTM;
    }

    public void setEndTM(Date endTM) {
        this.endTM = endTM;
    }
}
