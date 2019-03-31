package com.hust.edu.twopoint;

/**
 * locate com.hust.edu.twopoint
 * Created by MasterTj on 2019/3/31.
 * LetCode 167 twoSum
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 */
public class _167_twoSum {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while (low<high){
            if(numbers[low]+numbers[high]==target){
                return new int[]{low+1,high+1};
            }else if(numbers[low]+numbers[high]>target) high--;
            else low++;
        }
        return new int[]{};
    }
}
