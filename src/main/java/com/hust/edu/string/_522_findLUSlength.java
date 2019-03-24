package com.hust.edu.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * LetCode 522 最长特殊序列 II
 * 给定字符串列表，你需要从它们中找出最长的特殊序列。最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。
 *
 * 解题思路：只需要找到最大的字符串数组里唯一的字符串，并且该字符串不是任何一个比他长的字符串的子序列就可以
 */
public class _522_findLUSlength {
    public static int findLUSlength(String[] strs) {
        Arrays.sort(strs,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });

        HashMap<String,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if(hashMap.get(strs[i])==null)
                hashMap.put(strs[i],1);
            else {
                Integer integer = hashMap.get(strs[i]);
                hashMap.put(strs[i],++integer);
            }
        }

        for (int i = 0; i < strs.length; i++) {
            String target = strs[i];
            if(hashMap.get(target)==1){
                boolean isSub=false;
                for (int j = 0; j < i; j++) {
                    if(isSubString(strs[j],target))
                        isSub=true;
                }
                if(!isSub)
                    return target.length();
            }
        }
        return -1;
    }

    private static boolean isSubString(String parent,String target){
        int index=0;
        for (int i = 0; i < parent.length(); i++) {
            if(index<target.length() && parent.charAt(i)==target.charAt(index)){
                index++;
            }
        }

        if(index==target.length())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int luSlength = _522_findLUSlength.findLUSlength(new String[]{"aabbcc", "aabbcc","bc","bcc","aabbccc"});

    }
}
