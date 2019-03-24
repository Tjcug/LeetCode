package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by mastertj on 2019/3/24.
 * 917  仅仅反转字母
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * "Test1ng-Leet=code-Q!"
 * "Qedo1ct-eeLg=ntse-T!"
 */
public class _917_reverseOnlyLetters {
    public static String reverseOnlyLetters(String S) {
        if(S.length()==0)
            return "";
        char[] chars = S.toCharArray();
        int i=0;
        int j=S.length()-1;
        while (i<j){
            while (i<j && !isLetters(chars[i])){
                i++;
            }
            while (i<j && !isLetters(chars[j])){
                j--;
            }

            char temp=chars[j];
            chars[j]=chars[i];
            chars[i]=temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    private static boolean isLetters(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        String s = _917_reverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet-code-Q!");
        System.out.println(s);
    }
}
