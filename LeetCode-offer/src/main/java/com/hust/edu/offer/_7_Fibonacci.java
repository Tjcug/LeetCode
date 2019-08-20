package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 * 斐波那契数列
 * 递归思路 和 动态规划思路
 */
public class _7_Fibonacci {
    //递归思路
//    public int Fibonacci(int n) {
//        if(n==0)
//            return 0;
//        if(n==1)
//            return 1;
//        return Fibonacci(n-1)+Fibonacci(n-2);
//    }

    //动态规划思路
    public int Fibonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
