package com.kevin.datastruct.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * @author 陈立庚
 * 将空格替换成为%20
 */
@Slf4j
public class ReplaceChar {

    /**
     * 将空格替换成为20%这个字符
     * @param s 字符串
     * @return 返回一个替换好的字符
     */
    public String replaceSpace(String s) {
        if (StringUtils.isBlank(s)){
            throw new IllegalArgumentException("字符串为空异常");
        }
        s = s.replaceAll(" ","20%");
        log.info("s->{}",s);
        return s;
    }

    /**
     * 不使用replace 来替换元素
     * @param s 字符串
     * @return
     */
    public String replaceSpaceNotUseFunction(String s){
        if (StringUtils.isBlank(s)){
            throw new IllegalArgumentException("字符串为空异常");
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){
                builder.append("20%");
            }else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        ReplaceChar place = new ReplaceChar();
        String s = place.replaceSpaceNotUseFunction("We are happy.");
        System.out.println(s);
    }
}
