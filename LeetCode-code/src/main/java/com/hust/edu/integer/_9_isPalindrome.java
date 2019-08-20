package com.hust.edu.integer;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2018/11/5.
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class _9_isPalindrome {
    public boolean isPalindrome(int x) {
        if( x < 0)
            return false;
        StringBuilder stringBuilder=new StringBuilder(String.valueOf(x));
        StringBuilder reverse = stringBuilder.reverse();
        return reverse.toString().equals(String.valueOf(x));
    }
}
