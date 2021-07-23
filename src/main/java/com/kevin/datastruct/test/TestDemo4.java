package com.kevin.datastruct.test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author chenligeng
 */
public class TestDemo4 {

    public static void main(String[] args) throws InterruptedException {
        Date nowDate = new Date();
        Thread.sleep(3000);
        Date beforDate = new Date();
        System.out.println(beforDate.compareTo(beforDate));
    }

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        List<Integer> list1 = list.stream().filter(e -> e.equals(2)).collect(Collectors.toList());
//        System.out.println(list);
//        System.out.println(list1);
//        Map map = new HashMap();
//        map.put("1",1);
//        map.put("2",2);
//        map.put("2",3);
//        System.out.println(map.size());
//    }
}
