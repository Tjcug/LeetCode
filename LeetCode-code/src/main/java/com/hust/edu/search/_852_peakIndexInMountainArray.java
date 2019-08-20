package com.hust.edu.search;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/4/7.
 * 852. 山脉数组的峰顶索引
 * 我们把符合下列属性的数组 A 称作山脉：
 */
public class _852_peakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int low=0;
        int high=A.length-1;
        while (high-low>=2){
            int mid=(low+high)/2;
            if(A[mid]<A[mid+1] && A[mid]>A[mid-1])
                low=mid;
            else if(A[mid]>A[mid+1] && A[mid]<A[mid-1])
                high=mid;
            else
                return mid;
        }
        return -1;
    }
}
