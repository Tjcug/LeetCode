package com.hust.edu.array;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/12/7.
 * LetCode 78 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class _78_subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> list = result.get(j);
                List<Integer> temp=new ArrayList<>();
                temp.addAll(list);
                temp.add(nums[i]);
                result.add(temp);
            }
            List<Integer> numList=new ArrayList<>();
            numList.add(nums[i]);
            result.add(numList);
        }
        result.add(new ArrayList<>());
        return result;
    }
}
