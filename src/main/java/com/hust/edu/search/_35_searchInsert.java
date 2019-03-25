package com.hust.edu.search;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/3/25.
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 */
public class _35_searchInsert {
    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while (low<=high){
            int middle=(low+high)/2;
            if(nums[middle]<target){
                low=middle+1;
            }else if(nums[middle]>target){
                high=middle-1;
            }else
                return middle;
        }
        return low;
    }

    public static void main(String[] args) {
        int i = _35_searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 5);
        System.out.println(i);
    }
}
