package com.hust.edu.array;

/**
 * LetCode 27 移除元素
 * locate com.hust.com.hust.edu.array
 * Created by mastertj on 2019/2/1.
 */
public class _27_removeElement {
    public int removeElement(int[] nums, int val) {
        //数组存储下标
        int index=0;
        //遍历数组
        for(int i=0;i<nums.length;i++){
            //这个不是val，可以存入数组
            if(val!=nums[i]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
