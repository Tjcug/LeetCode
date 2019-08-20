package com.hust.edu.integer;

/**
 * locate com.hust.com.hust.edu.integer
 * Created by MasterTj on 2018/11/14.
 * LetCode231 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class _231_isPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        if( n%2 == 0)
            return isPowerOfTwo(n/2);
        else
            return false;
    }
}
