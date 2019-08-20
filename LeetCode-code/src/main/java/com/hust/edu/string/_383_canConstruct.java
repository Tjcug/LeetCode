package com.hust.edu.string;

import java.util.HashMap;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * LetCode 383 赎金信
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
 * 如果可以构成，返回 true ；否则返回 false。
 */
public class _383_canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ransomMap=new HashMap<>();
        HashMap<Character,Integer> magazineMap=new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if(ransomMap.get(ch)==null){
                ransomMap.put(ch,1);
            }else {
                Integer integer = ransomMap.get(ch);
                ransomMap.put(ch,++integer);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            if(magazineMap.get(ch)==null){
                magazineMap.put(ch,1);
            }else {
                Integer integer = magazineMap.get(ch);
                magazineMap.put(ch,++integer);
            }
        }

        for (Character character : ransomMap.keySet()) {
            Integer integer = ransomMap.get(character);
            if(magazineMap.get(character)==null || magazineMap.get(character)<integer){
                return false;
            }
        }
        return true;
    }
}
