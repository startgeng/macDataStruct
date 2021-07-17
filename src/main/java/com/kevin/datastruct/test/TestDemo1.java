package com.kevin.datastruct.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenligeng
 */
public class TestDemo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        String s = list.stream().collect(Collectors.joining(","));
        System.out.println(s);
    }
}
