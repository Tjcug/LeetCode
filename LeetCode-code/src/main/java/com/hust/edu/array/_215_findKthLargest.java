package com.hust.edu.array;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/12/5.
 * LetCode 215 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 */
public class _215_findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int tmp;
        for(int i=0;i<k;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    tmp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=tmp;
                }
            }
        }
        return nums[k-1];
    }
}
