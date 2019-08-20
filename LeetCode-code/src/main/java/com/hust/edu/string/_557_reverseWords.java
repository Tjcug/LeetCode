package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2018/12/5.
 * LetCode 557 反转字符串中的单词
 */
public class _557_reverseWords {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        for (String s1 : s.split(" ")) {
            sb.append(new StringBuffer(s1).reverse()).append(" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
