package com.kevin.datastruct.algorithm;

/**
 * @author 打印数字，从0到n输入几位数，就打印几位数的数字
 */
public class PrintNumberFor1ToN {

    /**
     * 打印数字，从0到n
     * @param n 这里是几位数，到时候就打印几位数的数字
     * @return 返回一个打印的数组
     * 思路，首先suan
     */
    public int[] printNumbers(int n) {
        if (Integer.valueOf(n) == null){
            throw new IllegalArgumentException("获取打印的字数失败");
        }
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= 10;
        }
        int[] result = new int[sum - 1];
        for (int i = 0; i < sum - 1; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(arr);
    }
}
