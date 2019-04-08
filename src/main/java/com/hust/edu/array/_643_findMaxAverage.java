package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 643. 子数组最大平均数 I
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * 滑动窗口解法
 */
public class _643_findMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length; double max = 0, sum = 0;
        for(int i = 0; i < k; i++) sum += nums[i];
        max = sum;

        //滑动窗口
        int l=0,r=k;
        while (l<n && r<n){
            sum+=nums[r]-nums[l];
            max=Math.max(max,sum);
            l++;
            r++;
        }
        return (max/k);
    }

    public static void main(String[] args) {
        double maxAverage = _643_findMaxAverage.findMaxAverage(new int[]{4, 0, 4, 3, 3}, 5);
        System.out.println(maxAverage);
    }
}
