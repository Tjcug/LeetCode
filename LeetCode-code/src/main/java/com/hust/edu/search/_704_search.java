package com.hust.edu.search;

import java.util.Arrays;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/4/7.
 */
public class _704_search {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length;
        int mid=-1;
        while (low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)
                high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}
