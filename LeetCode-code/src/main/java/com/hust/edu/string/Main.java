package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 */
public class Main {
    public static String getMaxString(String[] strs){
        String str0=strs[0];
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str0.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if(i<strs[j].length() && str0.charAt(i)==strs[j].charAt(i)){
                    continue;
                }else
                    return sb.toString();
            }
            sb.append(str0.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getMaxString(new String[]{"abc", "abc","ab"}));
    }
}
