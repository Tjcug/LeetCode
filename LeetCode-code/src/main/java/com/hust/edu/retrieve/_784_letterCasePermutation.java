package com.hust.edu.retrieve;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.retrieve
 * Created by MasterTj on 2019/4/5.
 * LetCode 784 字母大小写全排列
 */
public class _784_letterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> list=new ArrayList<>();
        char[] chars = S.toCharArray();
        int length = S.length();
        permuta(list,chars,0);
        return list;
    }

    private void permuta(List<String> list,char[] chars , int index){
        if(index>=chars.length){
            list.add(new String(chars));
            return;
        }
        char ch = chars[index];
        String temp=null;
        if(ch>='a' && ch<='z'){
            temp=String.valueOf(ch);
            chars[index]=temp.toUpperCase().charAt(0);
            permuta(list,chars,index+1);
            //递归完了后数组复原
            chars[index]=ch;
        }

        if(ch>='A' && ch<='Z'){
            temp=String.valueOf(ch);
            chars[index]=temp.toLowerCase().charAt(0);
            permuta(list,chars,index+1);
            //递归完了后数组复原
            chars[index]=ch;
        }

        permuta(list,chars,index+1);
    }

    public static void main(String[] args) {
        _784_letterCasePermutation letterCasePermutation=new _784_letterCasePermutation();
        List<String> list = letterCasePermutation.letterCasePermutation("3z4");
        System.out.println(list);
    }
}
