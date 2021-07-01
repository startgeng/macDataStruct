package com.kevin.datastruct.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chenligeng
 * 时间工具类
 */
public class DateUtils {

    /**
     * date 转 String
     * @param date 日期
     * @return
     */
    public static String dateConvertString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * string转date
     * @param dateString
     * @return
     * @throws ParseException
     */
    public static Date stringConvertDate(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(dateString);
        return parse;
    }

    /**
     * 比较两个时间大小 ,因为实现了comParable接口可以对两个日期进行比较
     * @param date1
     * @param date2
     * @return
     *  date1 > date2 的话结果是大于0
     */
    public static int compareDate(Date date1,Date date2){
        return date1.compareTo(date2);
    }


    /**
     * 获取今天之前天数的时间
     * @param d
     * @param day 要获取之前的多少天
     * @return
     */
    public static Date getDateBefore(Date d, int day) {
        Calendar no = Calendar.getInstance();
        no.setTime(d);
        no.set(Calendar.DATE, no.get(Calendar.DATE) - day + 1);
        return no.getTime();
    }

    /**
     * 比较date1和date2的大小
     * @param startTIme
     * @param endTIme
     * @return
     */
    public static int date1CompareDate2(Date startTIme,Date endTIme){
        return startTIme.compareTo(endTIme);
    }
}
