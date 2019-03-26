package com.hust.edu._ant;

/**
 * locate com.hust.edu._ant
 * Created by MasterTj on 2019/3/26.
 * 判断一个数字是否可以开平方根
 */
public class SquareRoot {
    public static boolean isSquareRoot(int n){
        int low=1;
        int high=n;
        while (low<=high){
            int mid=(low+high)/2;
            if(mid*mid==n)
                return true;
            else if(mid*mid<n)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean squareRoot = SquareRoot.isSquareRoot(72);
        System.out.println(squareRoot);
    }
}
