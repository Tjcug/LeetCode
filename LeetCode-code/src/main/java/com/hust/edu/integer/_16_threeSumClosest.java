package com.hust.edu.integer;

import java.util.Arrays;

/**
 * locate com.hust.com.hust.edu.integer
 * Created by MasterTj on 2018/11/9.
 * LetCode 16 最接近的三数之和
 */
public class _16_threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int reuslt=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j= nums.length-1;
            int k= i+1;
            while (k<j){
                int sum=nums[i]+ nums[j] +nums[k];
                if(Math.abs(sum-target)==0)
                    return sum;
                else if(sum - target <0){
                    k++;
                }
                else {
                    j--;
                }
                if(Math.abs(reuslt)> Math.abs(sum-target)){
                    reuslt=sum-target;
                }
            }
        }
        return target+reuslt;
    }
}
