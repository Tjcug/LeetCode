package com.hust.edu.offer;

import java.util.HashMap;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 第一个出现的字符
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 *
 * 使用Hash表处理
 */
public class _34_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0)
        return -1;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if(hashMap.get(charAt)==null){
                hashMap.put(charAt,1);
            }else{
                Integer integer = hashMap.get(charAt);
                hashMap.put(charAt,++integer);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            Integer integer = hashMap.get(str.charAt(i));
            if(integer==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        _34_FirstNotRepeatingChar firstNotRepeatingChar=new _34_FirstNotRepeatingChar();
        int google = firstNotRepeatingChar.FirstNotRepeatingChar("google");
        System.out.println(google);
    }
}
