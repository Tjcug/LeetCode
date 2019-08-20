package com.hust.edu.array;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/12/3.
 * LetCode 88 合并两个有序数组
 */
public class _88_merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num=new int[m+n];
        int i = 0,j=0,low=0;
        while (i < m && j < n){
            num[low++]= nums1[i]< nums2[j] ? nums1[i++] : nums2[j++];
        }

        while (i < m){
            num[low++]=nums1[i++];
        }

        while (j < n){
            num[low++]=nums2[j++];
        }
        for (int k = 0; k < m + n; k++) {
            nums1[k]=num[k];
        }
    }
}
