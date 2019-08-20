package com.hust.edu.search;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/4/5.
 * LetCode 69 实现 int sqrt(int x) 函数。
 *
 */
public class _69_mySqrt {
    public static int mySqrt(int x) {
        if(x==0 ||x==1)
            return x;
        int low=1;
        int high=x;
        while (low<high){
            int mid=(low+high)/2;
            if((long)mid*mid==x)return mid;
            else if((long)mid*mid<x)
                low=mid+1;
            else high=mid-1;
        }
        if(low * low > x)
            return low - 1;
        else
            return low;
    }

    public static void main(String[] args) {
        int i = _69_mySqrt.mySqrt(2147395599);
        System.out.println(i);
    }
}
