package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2018/12/25.
 * LetCode 415 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 */
public class _415_addStrings {
    public String addStrings(String num1, String num2) {
        int length1=num1.length();
        int length2=num2.length();
        StringBuilder sb=new StringBuilder();
        int num=length1>length2? length1: length2;
        int high=0;
        for (int i = 0; i < num; i++) {
            if(length1 - i - 1 < 0){
                int i2 = num2.charAt(length2 - i - 1) - '0';
                sb.append((i2 + high) % 10);
                high = (i2 + high) / 10;
            }else if(length2 - i - 1<0){
                int i1 = num1.charAt(length1 - i - 1) - '0';
                sb.append((i1 + high) % 10);
                high = (i1 + high) / 10;
            }else {
                int i1 = num1.charAt(length1 - i - 1) - '0';
                int i2 = num2.charAt(length2 - i - 1) - '0';
                sb.append((i1 + i2 + high) % 10);
                high = (i1 + i2 + high) / 10;
            }
        }
        if(high!=0)
            sb.append(high);
        return sb.reverse().toString();
    }
}
