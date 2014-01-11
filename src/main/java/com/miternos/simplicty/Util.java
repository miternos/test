package com.miternos.simplicty;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: eilkakk
 * Date: 1/11/14
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Util {
    public String getDate(){
        Calendar c = new GregorianCalendar();
        Date d = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("YYYY.MM.dd");

        return f.format(d);
    }
}
