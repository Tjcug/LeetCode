package com.hust.edu.offer;

import java.util.HashMap;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _34_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0)
        return -1;

        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : str.toCharArray()) {
            if(map.get(c)==null){
                map.put(c,1);
            }else {
                Integer integer = map.get(c);
                map.put(c,++integer);
            }
        }

        int pos = -1;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        _34_FirstNotRepeatingChar firstNotRepeatingChar=new _34_FirstNotRepeatingChar();
        int google = firstNotRepeatingChar.FirstNotRepeatingChar("google");
        System.out.println(google);
    }
}
