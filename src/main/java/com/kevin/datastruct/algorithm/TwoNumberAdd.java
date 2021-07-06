package com.kevin.datastruct.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenligeng 两数相加
 */
public class TwoNumberAdd {

//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])){
//                return new int[]{map.get(target - nums[i]),i};
//            }else {
//                map.put(nums[i],i);
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
