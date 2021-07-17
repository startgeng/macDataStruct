package com.kevin.datastruct.xywy.servicedate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author chenligeng
 * 日期工具类
 */
public class DateUtils {

    public static void main(String[] args) throws ParseException {

//        String month = startTime.substring(startTime.indexOf("-")+1, startTime.lastIndexOf("-"));
//        String day = startTime.substring(startTime.lastIndexOf("-")+1, startTime.length());
//        cal.setTime(sdf.parse(startTime));//设置起时间
//System.out.println(cal.getTime());
//        cal.add(Calendar.YEAR, 1);//增加一年
//        Integer year = Integer.valueOf(substring);
//        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month.equals("02") || month.equals("2")){
//            //闰年
//            cal.add(Calendar.DATE, 366);//增加一天
//        }else if (month.equals("02") || month.equals("2")){
//            //平年
//            cal.add(Calendar.DATE, 365);//增加一天
//        }else if (month.equals("4") || month.equals("04") || month.equals("06")|| month.equals("6") ||
//                month.equals("09") || month.equals("9") || month.equals("11")){
//            cal.add(Calendar.MONTH, 3);//增加一个月
//        }else {
//            cal.add(Calendar.MONTH, 1);//增加一个月
//            if (day.equals("31")) {
//                cal.add(Calendar.DATE, 1);
//            }
//        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String startTime = "2020-1-30 00：00：00";
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(startTime));//设置起时间
        cal.add(Calendar.YEAR,1);
        //cd.add(Calendar.DATE, -10);//减10天
//        cal.add(Calendar.MONTH, 1);//增加一个月

        System.out.println("输出:"+sdf.format(cal.getTime()));

    }

    public static int getDaysOfMonth(int year,int month) {
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }



}
