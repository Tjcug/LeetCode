package com.hust.edu.twopoint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * locate com.hust.edu.twopoint
 * Created by MasterTj on 2019/3/31.
 * LetCode 350 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class _350_intersect {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        int index1=0;
        int index2=0;
        while (index1<nums1.length && index2<nums2.length){
            if(nums1[index1]==nums2[index2]) {
                list.add(nums1[index1]);
                index1++;
                index2++;
            }
            else if(nums1[index1] < nums2[index2]) index1++;
            else
                index2++;
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
