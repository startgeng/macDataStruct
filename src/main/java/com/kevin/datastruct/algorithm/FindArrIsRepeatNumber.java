package com.kevin.datastruct.algorithm;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenligeng
 * 找到数组是重复的元素
 */
public class FindArrIsRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value < 2){
                map.remove(entry.getKey());
            }
        }
        while (!map.isEmpty()){
            Set<Integer> keys = map.keySet();
            for (Integer key : keys) {
                Integer removeNumber = map.remove(key);
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 0, 2, 5, 3};
//        System.out.println(findRepeatNumber(arr));
    }
}
