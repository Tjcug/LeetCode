package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * LeetCode 二进制求和
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 */
public class _67_addBinary {
    public static String addBinary(String a, String b) {
         int index=0;
         int top=0;//进位
         StringBuilder sb=new StringBuilder();
         while (index<a.length() || index<b.length()){
             int cha=0,chb=0;
             if(index<a.length())
                 cha=a.charAt(a.length()-1-index)-'0';
             if(index<b.length())
                 chb=b.charAt(b.length()-1-index)-'0';

             int res=cha+chb+top;
             if(res>=2) {
                 top = res / 2;
                 res = res % 2;
             }else top=0;
             sb.append(res);
             index++;
         }
         if(top!=0)
             sb.append(top);
         return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = _67_addBinary.addBinary("11", "1");
        System.out.println(s);
    }
}
