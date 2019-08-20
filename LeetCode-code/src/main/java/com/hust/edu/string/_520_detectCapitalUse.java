package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 520. 检测大写字母
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 */
public class _520_detectCapitalUse {
    public boolean detectCapitalUse(String word) {
        if(word.toLowerCase().equals(word) || word.toUpperCase().equals(word))
            return true;
        String first=String.valueOf(word.charAt(0)).toUpperCase();
        String result=first+word.substring(1,word.length()).toLowerCase();
        return result.equals(word);
    }
}
