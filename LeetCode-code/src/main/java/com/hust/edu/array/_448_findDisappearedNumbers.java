package com.hust.edu.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 448. 找到所有数组中消失的数字
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 */
public class _448_findDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        if(nums.length==0)return result;
        Arrays.sort(nums);
        int index=0;
        for (int i = 1; i <= nums.length; i++) {
            if(index<nums.length && nums[index]==i){
                while (index<nums.length-2 && nums[index]==nums[index+1])
                    index++;
                index++;
            }else
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        _448_findDisappearedNumbers.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
}
