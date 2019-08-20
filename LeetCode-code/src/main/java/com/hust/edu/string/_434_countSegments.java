package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 434. 字符串中的单词数
 */
public class _434_countSegments {
    public static int countSegments(String s) {
        String[] split = s.split(" ");
        int count=0;
        for(String str:split){
            if(!str.equals(""))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        _434_countSegments.countSegments(", , , ,        a, eaefa");
    }
}
