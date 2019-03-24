package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 680. 验证回文字符串 Ⅱ
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 */
public class _680_validPalindrome {
    public boolean validPalindrome(String s) {
        int index=0;
        if((index=isPalindrome(0,s.length()-1,s))==-1)
            return true;

        if(isPalindrome(index + 1,s.length() - 1 - index, s) != -1){
            if(isPalindrome(index,s.length() - 2 - index, s) != -1){
                return false;
            }
        }
        return true;
    }

    private int isPalindrome(int i,int j,String s){
        while (i<j){
            if(s.charAt(i)!=s.charAt(j))
                return i;
            i++;
            j--;
        }
        //表示找到了 是回文数列
        return -1;
    }
}
