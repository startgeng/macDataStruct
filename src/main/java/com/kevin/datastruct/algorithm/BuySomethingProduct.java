package com.kevin.datastruct.algorithm;

/**
 * @author chenligeng
 * 买股票算能赚到的最大值
 */
public class BuySomethingProduct {

    /**
     * 贪心算法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int price : prices) {
            if (min > price){
                min = price;
            }else {
                max = price - min > max ? price - min : max;
            }
        }
        return max;
    }
}
