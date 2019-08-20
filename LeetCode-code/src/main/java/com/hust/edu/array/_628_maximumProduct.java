package com.hust.edu.array;

import java.util.Arrays;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 628. 三个数的最大乘积
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 */
public class _628_maximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3], nums[0]*nums[1]*nums[n-1]);
    }
}
