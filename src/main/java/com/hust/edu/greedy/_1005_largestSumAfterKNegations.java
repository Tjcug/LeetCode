package com.hust.edu.greedy;

import java.util.Arrays;

/**
 * locate com.hust.edu.greedy
 * Created by MasterTj on 2019/4/5.
 * LetCode 1005 K 次取反后最大化的数组和
 * 给定一个整数数组 A，我们只能用以下方法修改该数组：我们选择某个个索引 i 并将 A[i] 替换为 -A[i]，然后总共重复这个过程 K 次。（我们可以多次选择同一个索引 i。）
 */
public class _1005_largestSumAfterKNegations {
    public static int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for (int i = 0; i < K; i++) {
            A[0]=-A[0];
            Arrays.sort(A);
        }
        int sum=0;
        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        _1005_largestSumAfterKNegations.largestSumAfterKNegations(new int[]{3,-1,0,2},3);
    }
}
