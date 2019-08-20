package com.hust.edu.array;

import java.util.HashSet;
import java.util.Set;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/12/5.
 * LetCode 217 存在重复元素
 */
public class _217_containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else
                set.add(num);
        }
        return false;
    }
}
