package com.kevin.datastruct.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        Date date = getDateBefore(new Date(), 1);

        System.out.println(date.getTime());
    }

    public static Date getDateBefore(Date d, int day) {
        Calendar no = Calendar.getInstance();
        no.setTime(d);
        no.set(Calendar.DATE, no.get(Calendar.DATE) - day +1);
        Date time = no.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String s = sdf.format(time);
        Date parse = null;
        try {
            parse = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
}
