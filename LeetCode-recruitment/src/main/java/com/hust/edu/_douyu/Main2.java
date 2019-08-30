package com.hust.edu._douyu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * locate com.hust.edu._douyu
 * Created by MasterTj on 2019/8/20.
 */
public class Main2 {
    public static void main(String[] args) {
        Integer[] unionSet = getUnionSet(new Integer[]{1, 2, 3}, new Integer[]{3, 5, 6},new Integer[]{7,8,2});
        System.out.println(Arrays.toString(unionSet));
    }

    public static Integer[] getUnionSet(Integer[]A, Integer[] B, Integer[] C){
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(A));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(B));
        Set<Integer> set3 = new HashSet<Integer>(Arrays.asList(C));

        // 合并两个集合
        set1.addAll(set2);
        set1.addAll(set3);

        Integer[] arr = {};
        return set1.toArray(arr);
    }

    public static Integer[] getIntersection(Integer[] A, Integer[] B, Integer[] C){
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(A));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(B));
        Set<Integer> set3 = new HashSet<Integer>(Arrays.asList(C));

        // 交集两个集合
        set1.retainAll(set2);
        set1.retainAll(set3);

        Integer[] arr = {};
        return set1.toArray(arr);
    }
}
