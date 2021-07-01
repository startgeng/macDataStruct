package com.kevin.datastruct.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author chenligeng
 */
public class Test2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        List<Integer> collect = list.stream().filter(e -> e > 2 &&  e > 3).collect(Collectors.toList());
        System.out.println(collect);
    }

}
