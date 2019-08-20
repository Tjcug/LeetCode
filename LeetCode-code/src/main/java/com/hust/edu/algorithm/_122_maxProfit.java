package com.hust.edu.algorithm;

/**
 * locate com.hust.com.hust.edu.algorithm
 * Created by MasterTj on 2018/12/6.
 * LetCode 122 买卖股票的最佳时机2
 */
public class _122_maxProfit {
    public int maxProfit(int[] prices) {
        int maxVaule=0;
        int pos=0;
        int first,second;

        while (pos<prices.length) {
            while (pos+1<prices.length && prices[pos + 1] < prices[pos])
                pos++;
            first = pos;
            pos++;
            while (pos+1<prices.length && prices[pos + 1] > prices[pos])
                pos++;
            second = pos;
            if(first<prices.length && second<prices.length)
                maxVaule += prices[second] - prices[first];
        }

        return maxVaule;
    }
}
