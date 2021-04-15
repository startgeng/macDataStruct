package com.kevin.datastruct.algorithm;

import java.util.Arrays;

/**
 * @author clg
 * 查找超过数组长度一半的数字
 */
public class FindNumIsMore {

    /**
     * 查找数字超过数组长度一半的数字
     * @param nums 数组
     * @return 长度超过一半的数字
     * 莫斯投票发
     */
    public int majorityElement(int[] nums) {
        int cur = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0){
                cur = num;
            }
            if (cur == num){
                count++;
            }else   {
                count--;
            }
        }
        return cur;
    }

    /**
     * 根据原理来做 数组长度一半的数字 经过排序应该是在中间的
     * @param nums 数组
     * @return 该数字
     */
    public int array(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,4,8,5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
