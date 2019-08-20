package com.hust.edu._huya;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/3/26.
 * 有n*n个格子，每个格子都有正数或者0，从左上角往右下角行走，一共走两次，把所有经过的格子数目加起来，求最大值。
 * 动态规划
 * 解题思路：
 *总的来说，每走一步都会有四个分支（你理解成选择或者情况也可以）：

 1、两种都向下走

 2、第一种向下走，第二种向右走

 3、第一种向右走，第二种向下走

 4、两种都向右走

 可是，事情往往没有那么一帆风顺，我们假设，如果两条路径重合了，或有共同交点了，那该怎么办？因为我们是求和，所以如果到了一个相同的点，那我们的值不可以累加两次，
 所以还得加一个特判，来减去多余加上的值。
 */
public class FindMaxExcelSum {
    public static int findMaxExcelSum(int[][] nums){
        int n=nums.length;
        int dp[][][][]=new int[n][n][n][n];
        for(int x1=1;x1<=n;x1++)
            for(int y1=1;y1<=n;y1++)
                for(int x2=1;x2<=n;x2++)
                    for(int y2=1;y2<=n;y2++)//4个循环来枚举两条路在矩阵中的位置
                    {
                        dp[x1][y1][x2][y2]=Math.max(Math.max(dp[x1-1][y1][x2-1][y2],dp[x1-1][y1][x2][y2-1]),Math.max(dp[x1][y1-1][x2-1][y2],dp[x1][y1-1][x2][y2-1]))+nums[x1][y1]+nums[x2][y2];//状态转移方程
                        if(x1==x2 && y1==y2) dp[x1][y1][x2][y2]-=nums[x1][y1];//减去重复的值
                    }

        return dp[n][n][n][n];
    }
}
