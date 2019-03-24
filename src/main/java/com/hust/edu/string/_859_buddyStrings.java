package com.hust.edu.string;

import java.util.HashSet;
import java.util.Set;

/**
 * locate com.hust.edu.string
 * Created by mastertj on 2019/3/24.
 * 859. 亲密字符串
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 */
public class _859_buddyStrings {
    public static boolean buddyStrings(String A, String B) {
        if(A.length()==0 || B.length()==0)
            return false;
        if(A.length()!=B.length())
            return false;
        if(A.equals(B)){
            Set<Character> set=new HashSet<>();
            for (int i = 0; i < A.length(); i++) {
                set.add(A.charAt(i));
            }
            if(set.size()==A.length())
                return false;
            else return true;
        }
        int count=0;
        Set<Character> setA=new HashSet<>();
        Set<Character> setB=new HashSet<>();
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i)!=B.charAt(i)) {
                count++;
                setA.add(A.charAt(i));
                setB.add(B.charAt(i));
            }
            if(count>2)
                return false;
        }

        if(count==2){
            return setA.equals(setB);
        }

        return false;
    }

    public static void main(String[] args) {
        boolean b = _859_buddyStrings.buddyStrings("abcaa", "abcbb");
        System.out.println(b);
    }
}
