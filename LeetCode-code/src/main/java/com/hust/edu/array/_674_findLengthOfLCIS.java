package com.hust.edu.array;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2019/4/30.
 */
public class _674_findLengthOfLCIS {
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int max=1;
        int result=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]>nums[i]){
                result++;
            }else {
                max=Math.max(result,max);
                result=1;
            }
        }
        max=Math.max(result,max);
        return max;
    }

    public static void main(String[] args) {
        int lengthOfLCIS = _674_findLengthOfLCIS.findLengthOfLCIS(new int[]{1, 3, 5, 4, 2, 3, 4 ,5});
        System.out.println(lengthOfLCIS);
    }
}
