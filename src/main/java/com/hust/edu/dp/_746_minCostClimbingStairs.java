package com.hust.edu.dp;

/**
 * locate com.hust.edu.dp
 * Created by MasterTj on 2019/3/25.
 * 746. 使用最小花费爬楼梯
 * 数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。您需要找到达到楼层顶部的最低花费。
 */
public class _746_minCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int length=cost.length;
        if(length<=1)
            return 0;
        int[] dp=new int[length+1];
        dp[0]=0;
        dp[1]=0;
        for (int i = 2; i <=length ; i++) {
            dp[i]=Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
        }
        return dp[length];
    }

    public static void main(String[] args) {
        int i = _746_minCostClimbingStairs.minCostClimbingStairs(new int[]{0, 1, 1, 0});
        System.out.println(i);
    }
}
