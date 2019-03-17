package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 翻转字符序列顺序
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 */
public class _44_ReverseSentence {
    public String ReverseSentence(String str) {
       if(str.length()==0)
           return "";
       if(str.trim().equals("")){
           return str;
       }
       StringBuilder sb=new StringBuilder();
       String[] split = str.split(" ");
        for (int i = split.length-1; i >=0 ; i--) {
            sb.append(split[i]);
            if(i!=0)
                sb.append(" ");
        }
        return sb.toString();
    }
}
