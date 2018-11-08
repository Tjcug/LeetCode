package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2018/11/8.
 * LetCode 14 编写一个函数来查找字符串数组中的最长公共前缀。
 */
public class _14_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(index);
            for (String str : strs) {
                if (str.length() == i || current != str.charAt(index)) {
                    return str.substring(0, index);
                }
            }
            index++;
        }

        return strs[0].substring(0, index);
    }
}
