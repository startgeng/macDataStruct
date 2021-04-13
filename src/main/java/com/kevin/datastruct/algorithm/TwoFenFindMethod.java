package com.kevin.datastruct.algorithm;

/**
 * @author 二分查找发
 * 根据二分查找,找到最小的元素
 */
public class TwoFenFindMethod {

    /**
     * 二分查找发
     * @param numbers 数组
     * @return 返回一个最小的数
     */
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (numbers[right] > numbers[mid]){
                right = mid;
            }else if (numbers[right] < numbers[mid]){
                left = mid + 1;
            }else {
                right --;
            }
        }
        return numbers[left];
    }
}
