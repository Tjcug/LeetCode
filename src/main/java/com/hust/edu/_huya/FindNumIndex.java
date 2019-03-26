package com.hust.edu._huya;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/3/26.
 * 数组A中相邻两个数字只差的绝对值为1，如{1,2,3,4,3,2,3,4,5,4,5,6,7}
 */
public class FindNumIndex {
    public static int findNumIndex(int[] nums ,int target){
        int low=0;
        while (low<nums.length && low>=0){
            if(nums[low]==target)
                return low;
            else{
                low=low+target-nums[low];
            }
        }

        if(low<0 || low>=nums.length)
            return -1;
        else return low;
    }

    public static void main(String[] args) {
        int numIndex = FindNumIndex.findNumIndex(new int[]{1, 2, 3, 4, 3, 2, 3, 4, 5, 4, 5, 6, 7}, 10);
        System.out.println(numIndex);
    }
}
