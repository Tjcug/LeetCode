package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 485. 最大连续1的个数
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 */
public class _485_findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                int sum=1;
                while (i+1<nums.length && nums[i+1]==nums[i]) {
                    sum++;
                    i++;
                }
                i++;
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
