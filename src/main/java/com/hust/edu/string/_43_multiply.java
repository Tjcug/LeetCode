package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2018/11/23.
 * LetCode 43 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 */
public class _43_multiply {
    public String multiply(String num1, String num2) {
        int m =num1.length(), n=num2.length();
        int[] pos=new int[m+n];

        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                int result=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1=i+j, p2= i+j+1;
                int sum=result+pos[p2];
                pos[p1] += sum/10;
                pos[p2] = sum % 10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < pos.length; i++) {
            if(sb.length()!=0 || pos[i]!=0)
                sb.append(pos[i]);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
