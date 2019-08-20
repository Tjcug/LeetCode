package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * LetCode 521 最长特殊序列 Ⅰ
 * 给定两个字符串，你需要从这两个字符串中找出最长的特殊序列。最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。
 */
public class _521_findLUSlength {
    public int findLUSlength(String a, String b) {
        return a.equals(b)? -1 : Math.max(a.length(),b.length());
    }
}
