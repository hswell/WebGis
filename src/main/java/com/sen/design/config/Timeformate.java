package com.sen.design.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timeformate {
    public Date TimeTran(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date reTiem = sdf.parse(sdf.format(date));
        return reTiem;
    }
}
