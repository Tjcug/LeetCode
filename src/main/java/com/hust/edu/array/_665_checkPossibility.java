package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 665. 非递减数列
 * 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 */
public class _665_checkPossibility {
    public static boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }
        int cnt = 0;
        for (int i = 1; i < nums.length && cnt < 2; i++) {
            if (nums[i-1] <= nums[i]) {
                continue;
            }
            cnt++;
            if (i-2>=0 && nums[i-2] > nums[i]) {
                nums[i] = nums[i-1];
            }else {
                nums[i-1] = nums[i];
            }
        }
        return cnt <= 1;
    }

    public static void main(String[] args) {
        boolean b = _665_checkPossibility.checkPossibility(new int[]{3, 4, 2,3});
        System.out.println(b);
    }
}
