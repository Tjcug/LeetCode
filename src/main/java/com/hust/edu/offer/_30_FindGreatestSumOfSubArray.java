package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _30_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0)
            return 0;

        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int CurSum=0;
            for (int j = i; j < array.length; j++) {
                CurSum+=array[j];
                maxSum = maxSum > CurSum ? maxSum : CurSum;
            }
        }
        return maxSum;
    }
}
