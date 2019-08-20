package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2018/12/4.
 * LetCode 344 编写一个函数，其作用是将输入的字符串反转过来。
 */
public class _344_reverseString {
    public String reverseString(String s) {
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}
