package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 左旋转字符串
 */
public class _43_LeftRotateString {
    public String LeftRotateString(String str,int n) {
        StringBuilder sb=new StringBuilder();
        for (int i = n; i < str.length()+n; i++) {
            sb.append(str.charAt(i % str.length()));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        _43_LeftRotateString leftRotateString=new _43_LeftRotateString();
        String abcdefg = leftRotateString.LeftRotateString("abcdefg", 2);
        System.out.println(abcdefg);
    }
}
