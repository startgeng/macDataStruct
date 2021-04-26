package com.kevin.datastruct.algorithm;

/**
 * @author clg
 * 0-n-1个数字里面找到缺失的那个数字
 */
public class MissNumberAlgorithm {

    public int missingNumber(int[] nums) {
        //0～n-1 中缺失的数字
        int right = 0;
        int left = nums.length - 1;
        while (left < right){
            int mid = (right + left) / 2;
            if (nums[mid] == mid){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
