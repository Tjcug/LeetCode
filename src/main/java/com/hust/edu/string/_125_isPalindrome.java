package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * LetCode  验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class _125_isPalindrome {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < lowerCase.length(); i++) {
            if(lowerCase.charAt(i)!=' ' ){
                if((lowerCase.charAt(i)>='a' && lowerCase.charAt(i)<='z')||(lowerCase.charAt(i)>='0' && lowerCase.charAt(i)<='9'))
                sb.append(lowerCase.charAt(i));
            }
        }
        String string = sb.toString();
        String palindrome = sb.reverse().toString();
        return palindrome.equals(string);
    }
}
