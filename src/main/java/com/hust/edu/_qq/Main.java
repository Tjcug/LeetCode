package com.hust.edu._qq;

/**
 * locate com.hust.edu._qq
 * Created by MasterTj on 2019/3/23.
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 */
public class Main {
    public static String getMaxString(String[] strs){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char temp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
               if(i>=strs[j].length() || strs[j].charAt(i)!=temp){
                   return sb.toString();
               }
            }
            sb.append(temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getMaxString(new String[]{"abc","ab","abcde"}));
    }
}
