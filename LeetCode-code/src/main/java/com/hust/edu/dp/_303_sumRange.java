package com.hust.edu.dp;

/**
 * locate com.hust.edu.dp
 * Created by MasterTj on 2019/3/25.
 * 303. 区域和检索 - 数组不可变
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 */
public class _303_sumRange {
    //dp[i]为数组前i个元素的和
    private int[] dp;
    private int length;
    public _303_sumRange(int[] nums) {
        length=nums.length;
        dp=new int[length+1];
        dp[0]=0;
        for (int i = 1; i <= nums.length; i++) {
            dp[i]=dp[i-1]+nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return dp[j+1]-dp[i];
    }
}
