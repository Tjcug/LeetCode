package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2018/12/22.
 * LetCode 28 实现 strStr() 函数。
 */
public class _28_strStr {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0)
            return 0;
        if (needle.length() > haystack.length())
            return -1;
        int j=0;//needle指针
        int i=0;
        for (i = 0; i < haystack.length(); ++i) {
            if (j==needle.length()){//判断完成
                return i - needle.length();
            }
            if (haystack.charAt(i) == needle.charAt(j)){
                j++;
            } else{
                i -= j;
                j=0;
            }
        }
        if (j==needle.length()){//判断完成
            return i - needle.length();
        }
        return -1;
    }
}
