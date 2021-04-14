package com.kevin.datastruct.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * 交换奇偶数
 */
public class ChangeNum {

    /**
     * 交换奇数偶数
     * @param nums 将数组的奇数偶数相互交换
     * @return 返回一个数组
     */
    public int[] exchange(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            while (start < end && nums[start] % 2 == 0){
                start++;
            }
            while (start < end && nums[start] % 2 == 1){
                end --;
            }
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        return nums;
    }

    /**
     * 交换数组的方式二 奇数排列在数组前面 偶数排列在数组后面
     * @param nums 待排列的数组
     * @return 返回一个数组
     */
    public int[] exchangeArray(int[] nums){
        List result1 = new ArrayList();
        List result2 = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                result2.add(nums[i]);
            }
            if (nums[i] % 2 == 1){
                result1.add(nums[i]);
            }
        }
        boolean resultCount = result1.add(result2);
        Object[] ints = result1.toArray();
        int[] result = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            result[i] = (int) ints[i];
        }
        return result;
    }
}
