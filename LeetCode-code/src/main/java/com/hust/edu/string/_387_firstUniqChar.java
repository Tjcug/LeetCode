package com.hust.edu.string;

import java.util.LinkedHashMap;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * LetCode 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class _387_firstUniqChar {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> linkedHashMap=new LinkedHashMap<>();
        for(Character character: s.toCharArray()){
            if(linkedHashMap.get(character)==null)
                linkedHashMap.put(character,1);
            else {
                Integer integer = linkedHashMap.get(character);
                linkedHashMap.put(character, ++integer);
            }
        }
        for(Character ch : linkedHashMap.keySet()){
            Integer integer = linkedHashMap.get(ch);
            if(integer==1)
                return s.indexOf(ch);
        }
        return -1;
    }
}
