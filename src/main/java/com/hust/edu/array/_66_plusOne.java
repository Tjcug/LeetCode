package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 */
public class _66_plusOne {
    public int[] plusOne(int[] digits) {
        int top=1;
        int index=digits.length-1;
        while (top!=0 && index>=0){
            int sum=digits[index]+top;
            top=sum/10;
            digits[index]=sum%10;
            index--;
        }
        if(top>0){
            int[] res=new int[digits.length+1];
            res[0]=top;
            for (int i = 1; i < res.length; i++) {
                res[i]=digits[i-1];
            }
            return res;
        }
        return digits;
    }
}
