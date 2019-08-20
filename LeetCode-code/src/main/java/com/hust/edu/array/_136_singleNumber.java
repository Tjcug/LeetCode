package com.hust.edu.array;

import java.util.HashSet;
import java.util.Set;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/11/12.
 * LetCode 136 只出现一次的数字
 */
public class _136_singleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) { // add成功返回true，如果set中已有相同数字，则add方法会返回false
                set.remove(nums[i]); // 删除重复出现的数字
            }
        }
        return set.iterator().next();
    }
}
