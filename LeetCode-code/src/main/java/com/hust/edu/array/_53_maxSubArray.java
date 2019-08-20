package com.hust.edu.array;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/11/12.
 * LetCode 53 最大子序列的和
 */
public class _53_maxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int thisSum = 0;
            for (int j = i; j < nums.length; j++) {
                thisSum += nums[j];
                maxSum = maxSum > thisSum ? maxSum : thisSum;
            }
        }
        return maxSum;
    }
}
