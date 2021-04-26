package com.kevin.datastruct.algorithm;

/**
 * @author clg
 * 找到两个数字累计等于输入的一个数字的和并且随机返回一值
 */
public class FindNumIsTwoNumberAdd {

    /**
     * 找到累加的和，并且随机返回一对值
     * @param nums  数组
     * @param target 输入的数字
     * @return 返回一个组成值的数组
     */
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            int sum = nums[start] + nums[end];
            if (sum < target){
                start++;
            }else if (sum > target){
                end--;
            }else {
                return new int[]{nums[start],nums[end]};
            }
        }
        return new int[0];
    }
}
