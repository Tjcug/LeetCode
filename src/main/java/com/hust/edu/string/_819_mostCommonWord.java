package com.hust.edu.string;

import java.util.HashMap;

/**
 * locate com.hust.edu.string
 * Created by mastertj on 2019/3/24.
 * 819. 最常见的单词
 * 给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。题目保证至少有一个词不在禁用列表中，而且答案唯一。
 */
public class _819_mostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] split = str.split("\\s+");
        HashMap<String,Integer> map=new HashMap<>();
        for(String temp:split){
            if(!isInBanned(banned,temp)){
                if(map.get(temp)==null){
                    map.put(temp,1);
                }else {
                    Integer integer = map.get(temp);
                    map.put(temp,++integer);
                }
            }
        }
        String result="";
        int max=Integer.MIN_VALUE;
        for (String key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                result=key;
            }
        }
        return result;
    }

    private boolean isInBanned(String[] baned,String word){
        for(String str:baned){
            if(str.equals(word))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
