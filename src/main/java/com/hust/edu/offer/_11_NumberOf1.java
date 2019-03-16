package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/2/28.
 * 位运算 判断一个数字转换成二进制之后又多少数字1
 * 思路：把一个数字减去1，再和原来的数字进行与位运算，得到新的数字
 */
public class _11_NumberOf1 {
    public int NumberOf1(int n) {
        int count=0;
        while (n!=0){
            n= (n-1)&n;
            count++;
        }
        return count;
    }
}
