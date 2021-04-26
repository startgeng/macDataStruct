package com.kevin.datastruct.algorithm;

/**
 * @author clg
 */
public class ReverWordsString {

    /**
     * 倒置字符串 如果字符串里面有空格，就改为第一个空格
     *
     * @param s 字符串数据
     * @return 返回倒置的数据
     */
    public String reverseWords(String s) {
        String temp = s.trim();
        int start = s.length() - 1;
        int end = s.length() - 1;
        String res = "";
        while (start >= 0) {
            //如果开始大于0的
            while (start >= 0 && temp.charAt(start) != ' ') {
                start--;
            }
            res += res.substring(start + 1, end + 1);
            while (start >= 0 && temp.charAt(start) == ' ') {
                start--;
            }
            end = start;
        }
        return res.trim();
    }
}