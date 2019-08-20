package com.hust.edu.integer;

/**
 * locate com.hust.com.hust.edu.integer
 * Created by MasterTj on 2018/11/5.
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 */
public class _367_isPerfectSquare {
    public boolean isPerfectSquare(int num) {
       long low=0,high=num;
       while (low<=high){
           long mid=(low+high)/2;
           long t=mid*mid;
           if(t==num)
               return true;
           if(t<num)
               low=mid+1;
           if(t>num)
               high=mid-1;
       }
       return false;
    }
}
