package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by mastertj on 2019/2/1.
 * LetCode 移动零 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class _283_moveZeroes {
    public void moveZeroes(int[] nums) {
        int index=0;
        //遍历数组
        for(int i=0;i<nums.length;i++){
            //这个不是val，可以存入数组
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
