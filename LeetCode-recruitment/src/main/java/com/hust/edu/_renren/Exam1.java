package com.hust.edu._renren;

/**
 * locate com.hust.edu._renren
 * Created by MasterTj on 2019/9/3.
 */
public class Exam1 {
    public static void moveZeroes(int[] nums) {
        int i = 0;//记录非0元素的个数
        for(int j = 0; j < nums.length ; j++){
            if(nums[j] != 0){
                nums[i++] = nums[j];
            }
        }
        for(int k = i; k< nums.length; k++){
            nums[k] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[]{0,1,0,3,12};
        Exam1.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
