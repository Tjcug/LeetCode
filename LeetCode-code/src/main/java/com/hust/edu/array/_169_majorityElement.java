package com.hust.edu.array;

import java.util.Arrays;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/12/4.
 * LetCode 169 求众数 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 */
public class _169_majorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
