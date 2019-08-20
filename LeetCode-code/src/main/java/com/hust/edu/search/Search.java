package com.hust.edu.search;

/**
 * locate com.hust.edu.search
 * Created by mastertj on 2018/10/22.
 * 查找算法
 */
public class Search {
    // 折半查找
    public static <T extends Comparable<? super T>> int binarysearch(T[] a, T x){
        int low=0, high=a.length-1;

        while (low<=high){
            int mid=(low+high)/2;

            if(a[mid].compareTo(x)<0){
                low=mid+1;
            }else if(a[mid].compareTo(x)>0)
                high=mid-1;
            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] nums={0,1,2,3,4,5,6,7,8,9};
        int binarysearch = binarysearch(nums, 6);
        System.out.println(binarysearch);

    }
}
