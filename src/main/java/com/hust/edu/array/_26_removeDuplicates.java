package com.hust.edu.array;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2018/11/10.
 * LetCode 26 删除排序数组中的重复项
 */
public class _26_removeDuplicates {
    public int removeDuplicates(int[] nums) {
       Set<Integer> set= new LinkedHashSet<>();
       for(int num :nums){
           set.add(num);
       }
        for (int i = 0; i < set.size(); i++) {
            nums[i]= (int) set.toArray()[i];
        }
        return set.size();
    }
}


