package com.kevin.datastruct.algorithm;

/**
 * @author clg
 * 查询一个数组里面出现的数字的次数
 */
public class FindNumberNum {

    public int search(int[] nums, int target) {
        return getRightMargin(nums, target) - getRightMargin(nums, target - 1);
    }

    /**
     * 递归查询出现的次数
     * @param nums 有序的数组
     * @param
     * @return
     */
    private int getRightMargin(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] <= target){
                left = left + 1;
            }else {
                right = right + 1;
            }
        }
        return left;
    }
}
