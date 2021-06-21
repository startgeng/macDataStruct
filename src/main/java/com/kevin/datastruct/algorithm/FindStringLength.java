package com.kevin.datastruct.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenligeng
 *
 */
public class FindStringLength {

    /**
     * 滑动窗口求不重复的字符串长度
     * @param s 字符串的长度
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int right = 0;
        int left = 0;
        int result = 0;
        while (right < s.length()){
            char c = s.charAt(right);
            if (map.containsKey(c)){
                left = Math.max(left,map.get(c) + 1);
            }
            map.put(c,right++);
            result = Math.max(result,right - left);
        }
        return result;
    }
}
