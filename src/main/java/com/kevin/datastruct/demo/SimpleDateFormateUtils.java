package com.kevin.datastruct.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author clg
 */
public class SimpleDateFormateUtils {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        Date dataParse = sdf.parse("2021-04-25 14:16:19");
        System.out.println(dataParse);
    }
}
