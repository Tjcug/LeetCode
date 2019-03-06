package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _48_Add {
    public int Add(int num1,int num2) {
        int sum,temp;
        while(num2!=0){
            sum=num1^num2;//不考虑进位相加
            temp=(num1 & num2)<<1;//计算进位值
            num1=sum;
            num2=temp;
        }
        return num1;
    }
}
