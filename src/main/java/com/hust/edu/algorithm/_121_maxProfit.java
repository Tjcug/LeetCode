package com.hust.edu.algorithm;

/**
 * locate com.hust.edu.algorithm
 * Created by MasterTj on 2018/12/6.
 * LetCode 121 买卖股票的最佳时机
 */
public class _121_maxProfit {
    public int maxProfit(int[] prices) {
        int maxVaule=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                maxVaule=Math.max(prices[j]-prices[i],maxVaule);
            }
        }

        return maxVaule;
    }
}
