package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _11_NumberOf1 {
    public int NumberOf1(int n) {
       int count=0;
       String str=Integer.toBinaryString(n);
       for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='1')
                count++;
        }
        return count;
    }
}
