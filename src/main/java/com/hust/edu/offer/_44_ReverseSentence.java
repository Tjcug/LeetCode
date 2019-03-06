package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _44_ReverseSentence {
    public String ReverseSentence(String str) {
        if(str.length()==0)
            return "";
        if(str.trim().equals("")){
            return str;
        }
        String[] split = str.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = split.length-1; i >=0 ; i--) {
            sb.append(split[i]);
            if(i!=0)
                sb.append(" ");
        }
        return sb.toString();
    }
}
