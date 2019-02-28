package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/2/28.
 */
public class _11_NumberOf1 {
    public int NumberOf1(int n) {
        int t=0;
        String s = Integer.toBinaryString(n);
        for (char ch: s.toCharArray()){
            if(ch == '1')
                t++;
        }

        return t;
    }
}
