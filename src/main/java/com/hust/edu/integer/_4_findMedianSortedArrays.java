package com.hust.edu.integer;

/**
 * locate com.hust.edu.integer
 * Created by MasterTj on 2018/11/6.
 * LetCode 4 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 */
public class _4_findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int[] arr=new int[length];
        int low=0;
        int l1=0;
        int l2=0;
        while (l1 < nums1.length && l2 < nums2.length){
            arr[low++]= nums1[l1] < nums2[l2] ? nums1[l1++] : nums2[l2++];
        }

        while (l1 < nums1.length){
            arr[low++]= nums1[l1++];
        }

        while (l2 < nums2.length){
            arr[low++]= nums2[l2++];
        }

        int center=length/2;
        if(length % 2 == 0){
            //偶数
            return ((double) (arr[center]+arr[center-1]))/2;
        }else
            return arr[center];
    }
}
