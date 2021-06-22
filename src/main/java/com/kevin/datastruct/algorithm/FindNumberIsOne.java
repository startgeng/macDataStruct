package com.kevin.datastruct.algorithm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 只出现了一次的数字
 * @author chenligeng
 */
public class FindNumberIsOne {

    public char firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        if (map.size() == 0 && map == null){
            return ' ';
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
