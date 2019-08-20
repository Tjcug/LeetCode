package com.hust.edu.twopoint;

import java.util.Arrays;

/**
 * locate com.hust.edu.twopoint
 * Created by mastertj on 2019/3/31.
 * LetCode 977 977. 有序数组的平方
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 */
public class _977_sortedSquares {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i]= (int) Math.pow(A[i],2);
        }
        Arrays.sort(A);
        return A;
    }
}
