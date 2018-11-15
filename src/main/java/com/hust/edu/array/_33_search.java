package com.hust.edu.array;

import java.util.*;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2018/11/15.
 * LetCode 33 搜索旋转排序数组
 * 假设按照升
 * 序排序的数组在预先未知的某个点上进行了旋转。
 */
public class _33_search {
    public int search(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        Integer result = map.get(target);
        if(result!=null)
            return result;
        else return -1;
    }
}
