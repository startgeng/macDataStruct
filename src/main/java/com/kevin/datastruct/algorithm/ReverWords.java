package com.kevin.datastruct.algorithm;

/**
 * @author clg
 * 反转一个字符串 并且将它后面的字符串拼接到字符串的后面
 */
public class ReverWords {

    /**
     * 字符串的反转拼接
     * @param s 字符串
     * @param n 要截取的位置
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        String res = "";
        for (int i = n; i < s.length(); i++) {
            res += s.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
