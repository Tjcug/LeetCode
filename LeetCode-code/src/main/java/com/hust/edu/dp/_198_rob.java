package com.hust.edu.dp;

/**
 * locate com.hust.edu.dp
 * Created by MasterTj on 2019/3/25.
 * 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 */
public class _198_rob {
    public static int rob(int[] nums) {
        int length=nums.length;
        if(length<1)
            return 0;
        //dp[i]表示第i个房子，小偷能偷窃的最大值
        int dp[]=new int[length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        return dp[nums.length];
    }

    public static void main(String[] args) {
        int rob = _198_rob.rob(new int[]{1, 2, 3, 1});
        System.out.println(rob);
    }
}
