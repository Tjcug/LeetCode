package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 459. 重复的子字符串
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 */
public class _459_repeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length()/2; i++) {
            String temp=s.substring(0,i);
            if(isSubstringPattern(s,temp))
                return true;
        }
        return false;
    }

    private static boolean isSubstringPattern(String source, String str){
        int length = str.length();
        int index=0;
        while (index+length<=source.length()){
            if(!source.substring(index,index+length).equals(str))
                return false;
            else
                index=index+length;
        }
        if(index==source.length())
            return true;
        else return false;
    }

    public static void main(String[] args) {
        boolean substringPattern = isSubstringPattern("abab", "ab");
        System.out.println(substringPattern);
    }
}
