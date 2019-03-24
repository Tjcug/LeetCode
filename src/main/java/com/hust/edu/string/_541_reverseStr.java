package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 541. 反转字符串 II
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
 * 如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 */
public class _541_reverseStr {
    public String reverseStr(String s, int k) {
        int length=2*k;
        int index=0;
        StringBuilder sb=new StringBuilder();
        while (index<s.length()){
            int size= index+length>s.length()? s.length():index+length;
            sb.append(reverseStrHelper(s.substring(index,size),k));
            index=index+length;
        }
        return sb.toString();
    }

    private String reverseStrHelper(String s,int k){
        StringBuilder temp=new StringBuilder();
        StringBuilder result=new StringBuilder();
        if(s.length()>=k){
            String string = temp.append(s.substring(0, k)).reverse().toString();
            result.append(string).append(s.substring(k,s.length()));
        }else {
            String string = temp.append(s).reverse().toString();
            result.append(string);
        }
        return result.toString();
    }
}
