package com.kevin.datastruct.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author clg
 */
public class StringSplitUtils {

    public static void main(String[] args) {
//        String s = "a(b(1256";
//        String[] split1 = s.split("[(,)]");
//        System.out.println(Arrays.toString(split1));
//        String str = "a|b|c";
//        String[] split = str.split("\\|");
//        System.out.println(Arrays.toString(split));

//        String s = "abcdefag";
//        String s1 = StringUtils.substring(s, 0,s.length()-1);
//        int a = s.indexOf("a", 2);
//        System.out.println(a);
        String s = "10.1.2";
        int indexOf = s.indexOf(".",0);
        System.out.println(s.substring(0, s.indexOf(".",s.indexOf(".")+1 )));
        System.out.println(s.indexOf(".")+1);
    }
}
