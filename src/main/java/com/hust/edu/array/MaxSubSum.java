package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by mastertj on 2018/10/22.
 * 最大子序列求和的问题
 */
public class MaxSubSum {
    // 时间复杂度O（N^3）
    public static int maxSubSum1(int nums[]){
        int maxSum=0;
        for(int i=0; i< nums.length; i++){
            for(int j=i; j<nums.length;j++){
                int thisSum=0;
                for(int tmp=i;tmp<=j;tmp++){
                    thisSum+=nums[tmp];
                }
                maxSum = maxSum > thisSum ? maxSum:thisSum;
            }
        }
        return maxSum;
    }

    // 时间复杂度O（N^2）
    public static int maxSubSum2(int nums[]) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int thisSum = 0;
            for (int j = i; j < nums.length; j++) {
                thisSum += nums[j];
                maxSum = maxSum > thisSum ? maxSum : thisSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums={0,18,-79,53,2,-87,0,53,199};
        //int i = maxSubSum1(nums);
        int i = maxSubSum2(nums);
        System.out.println(i);
    }
}
