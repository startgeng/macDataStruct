package com.kevin.datastruct.demo;

/**
 * @author 陈立庚
 */
public class ByteCodeSimple {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("");
        int i = 1;
        int j = 5;
        i++;
        ++j;
        System.out.println(i);
        System.out.println(j);
    }
}