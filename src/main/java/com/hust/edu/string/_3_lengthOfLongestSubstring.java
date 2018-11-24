package com.hust.edu.string;

import java.util.HashSet;
import java.util.Set;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2018/11/24.
 * LetCode 3 无重复字符的最大子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class _3_lengthOfLongestSubstring {
//    public int lengthOfLongestSubstring(String s) {
//        int result=0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                if(!hasRepeatChar(s.substring(i,j+1))){
//                    result=Math.max(result,(j-i+1));
//                }
//            }
//        }
//        return result;
//    }
//
//    private boolean hasRepeatChar(String s){
//        Set<Character> set=new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            if(set.contains(s.charAt(i))){
//                return true;
//            }else
//                set.add(s.charAt(i));
//        }
//        return false;
//    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
