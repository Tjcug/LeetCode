package com.hust.edu.offer;

import java.util.LinkedHashMap;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/8.
 */
public class _54_FirstAppearingOnce {
    private LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<>();

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(hashMap.get(ch)==null){
            hashMap.put(ch,1);
        }else{
            Integer integer = hashMap.get(ch);
            hashMap.put(ch,++integer);
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if(hashMap.size()==0)
            return '#';

        for (Character character : hashMap.keySet()) {
            if(hashMap.get(character)==1)
                return character;
        }
        return '#';
    }
}
