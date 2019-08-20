package com.hust.edu.string;

import java.util.ArrayList;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * LeetCode 58 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 */
public class _58_lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        ArrayList<String> arrayList=new ArrayList<>();
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                String str=s.substring(index,i);
                if(str.length()>0)
                    arrayList.add(str);
                index=i+1;
            }
        }
        String str=s.substring(index,s.length());
        if(str.length()>0)
            arrayList.add(str);
        if(arrayList.size()>0)
            return arrayList.get(arrayList.size()-1).length();
        else
            return 0;
    }

    public static void main(String[] args) {
        lengthOfLastWord(" ");
    }
}
