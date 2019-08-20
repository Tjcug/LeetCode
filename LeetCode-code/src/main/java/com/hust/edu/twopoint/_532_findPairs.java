package com.hust.edu.twopoint;

import java.util.Arrays;

/**
 * locate com.hust.edu.twopoint
 * Created by MasterTj on 2019/3/31.
 * LetCode 532 数组中的K-diff数对
 * 给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。
 * 这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.
 */
public class _532_findPairs {
    public static int findPairs(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                int low = i+1;
                int high = nums.length - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (nums[mid] == nums[i] + k) {
                        count++;
                        break;
                    } else if (nums[mid] > nums[i] + k) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int pairs = _532_findPairs.findPairs(new int[]{1, 1, 1, 1, 1}, 0);
        System.out.println(pairs);
    }
}
