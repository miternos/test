package com.miternos.simplicty.test;

import static org.junit.Assert.assertEquals;
import com.miternos.simplicty.Util;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: eilkakk
 * Date: 1/11/14
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */

public class UtilTest {
    @Test
    public void test(){
        Calendar c = new GregorianCalendar();
        Date d = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("YYYY.MM.dd");

        Util u = new Util();
        assertEquals(f.format(d), u.getDate() );
    }
}
