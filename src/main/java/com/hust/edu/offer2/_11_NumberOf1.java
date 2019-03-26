package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _11_NumberOf1 {
    public int NumberOf1(int n) {
        int count=0;
        String string = Integer.toBinaryString(n);
        for (int j = 0; j < string.length(); j++) {
            if(string.charAt(j)=='1')
                count++;
        }
        return count;
    }
}
