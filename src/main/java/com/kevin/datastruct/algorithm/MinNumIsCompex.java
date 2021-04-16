package com.kevin.datastruct.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 使用字符串组合成为最小的字符串
 */
public class MinNumIsCompex {

    public String minNumber(int[] nums) {
        List<String> strList = new ArrayList<>();
        if (nums.length == 0){
            return null;
        }
        for (int num : nums) {
            strList.add(String.valueOf(num));
        }
        strList.sort((a,b)->(a+b).compareTo(b+a));
        StringBuilder sb = new StringBuilder();
        for (String str : strList) {
            sb.append(str);
        }
        return sb.toString();
    }
}
