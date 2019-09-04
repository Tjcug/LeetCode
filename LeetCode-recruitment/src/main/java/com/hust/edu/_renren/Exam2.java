package com.hust.edu._renren;

import java.util.LinkedHashMap;

/**
 * locate com.hust.edu._renren
 * Created by MasterTj on 2019/9/3.
 */
public class Exam2 {
    public static int firstUniqChar(String str){
        str=str.toLowerCase();
        LinkedHashMap<Character,Integer> linkedHashMap= new LinkedHashMap();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!linkedHashMap.containsKey(ch))
                linkedHashMap.put(ch,1);
            else {
                int res=linkedHashMap.get(ch);
                linkedHashMap.put(ch,++res);
            }
        }

        int index=0;
        for (Character character : linkedHashMap.keySet()) {
            if(linkedHashMap.get(character)==1) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = firstUniqChar("rentren");
        System.out.println(index);
    }
}
