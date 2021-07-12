package com.kevin.datastruct.algorithm;

import java.util.*;

/**
 * @author chenligeng
 * 第一个字符出现的位置
 */
public class FirstCharLocal {

//    public static int firstUniqChar(String s) {
//        Map<Character,Integer> map = new LinkedHashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            }else {
//                map.put(s.charAt(i),1);
//            }
//        }
//        Character returnChar = null;
//        int sum = 0;
//        int temp = 0;
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 1){
//                temp += entry.getValue() - 1;
//            }
//            sum += 1;
//            if (entry.getValue() == 1){
//                return --sum;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
        int[] arr = new int[]{1,2,3};
        for (int i = 0; i < arr.length; i++) {
            arr[1]++;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
