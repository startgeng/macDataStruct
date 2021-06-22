package com.kevin.datastruct.algorithm;

/**
 * @author chenligeng
 * 第一个出现一次的字符
 */
public class FindNumberIsHaveOne {

    public char firstUniqChar(String s) {
        int[] arr = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            arr[c - 'a']++;
        }
        for (char c : chars) {
            if (arr[c - 'a'] == 1){
                return c;
            }
        }
        return ' ';
    }
}
