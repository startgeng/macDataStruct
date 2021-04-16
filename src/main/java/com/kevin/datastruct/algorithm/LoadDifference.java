package com.kevin.datastruct.algorithm;

import com.kevin.datastruct.reflect.Robot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈立庚
 */
public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
//        //forName会初始化代码
//        Class.forName("");
//        //不会初始化代码
//        Robot.class.getClassLoader();

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("cc");
        list.add("bb");
        list.sort((a,b) -> (a+b).compareTo(b+a));
        System.out.println(list.toString());
    }
}
