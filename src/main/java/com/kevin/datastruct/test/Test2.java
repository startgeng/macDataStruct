package com.kevin.datastruct.test;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author chenligeng
 */
public class Test2 {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(calendar.YEAR, 1);//把日期往后增加一年.整数往后推,负数往前移动
//        calendar.add(calendar.MONTH, 1);//把日期往后增加一个月.整数往后推,负数往前移动
//        calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
//        calendar.add(calendar.WEEK_OF_MONTH, 1);//把日期往后增加一周.整数往后推,负数往前移动
        date=calendar.getTime();   //这个时间就是日期往后推一天的结果
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(new Date());
        System.out.println(format);
    }

}
