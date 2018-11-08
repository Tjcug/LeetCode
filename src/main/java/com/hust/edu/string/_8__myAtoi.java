package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2018/11/8.
 * LetCode 8 实现 atoi，将字符串转为整数。
 */
public class _8__myAtoi {
    public static int myAtoi(String str) {
        String newstr = str.trim();//去掉开头空格
        int len = newstr.length();
        if(len == 0)
            return 0;
        int index = 0;//
        int sign = 1;//符号位,没有符号位默认为+
        int sum = 0;
        if(newstr.charAt(index)=='+'||newstr.charAt(index)=='-')
        {
            sign = newstr.charAt(index)=='+'?1:-1;//
            index++;
        }
        while(index<len)
        {
            int digit = newstr.charAt(index)-'0';
            if(digit < 0||digit > 9)
                break;
            if(( Integer.MAX_VALUE/10 < sum )||( Integer.MAX_VALUE/10 == sum&&Integer.MAX_VALUE%10<digit))//if out of the range
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;

            sum = sum*10 + digit;
            index ++;
        }
        return sum * sign;
    }


    public static void main(String[] args) {
        _8__myAtoi myAtoi=new _8__myAtoi();
        System.out.println(myAtoi.myAtoi("++++424324242343"));
    }
}
