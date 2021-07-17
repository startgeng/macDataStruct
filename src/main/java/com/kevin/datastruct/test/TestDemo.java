package com.kevin.datastruct.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenligeng
 */
public class TestDemo {

//    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = sdf.parse("2021-01-10 00:00:00");
//        String format = sdf.format(parse);
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
//        Date parse1 = sdf2.parse(format);
//        System.out.println(parse1);
//    }
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2021-07-06");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String format = sdf1.format(parse);
        System.out.println(sdf1.parse(format));
        System.out.println("测试数据");
    }
}
