package com.hust.edu.array;

import java.util.Arrays;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 */
public class _414_thirdMax {
    public static int thirdMax(int[] nums) {
        int k = 3;
        Arrays.sort(nums);
        if (k > nums.length)
            return nums[nums.length - 1];
        int index=nums.length-1;
        while (k>1){
            while (index>0 && nums[index]==nums[index-1])
                index--;
            k--;
            index--;
        }
        if(index<0)
            return nums[nums.length-1];
        return nums[index];
    }

    public static void main(String[] args) {
        int i = _414_thirdMax.thirdMax(new int[]{1,1,2});
        System.out.println(i);
    }
}
