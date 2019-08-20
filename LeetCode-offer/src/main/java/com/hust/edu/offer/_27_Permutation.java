package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 字符串全排列问题
 */
public class _27_Permutation {
    private ArrayList<String> list=new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if(str.length()==0)
            return list;
        PermutationHelper(str.toCharArray(),0);
        Collections.sort(list);
        return list;
    }

    private void PermutationHelper(char[] chars, int index){
        if(index==chars.length){
            list.add(String.valueOf(chars));
        }
        for (int i = index; i < chars.length; i++) {
            if(isSwap(chars,index,i)){
                swap(chars,index,i);
                PermutationHelper(chars,index+1);
                swap(chars,i,index);
            }
        }
    }

    //判断low到high之间是否有和low[high]元素相同的元素
    private boolean isSwap(char[] chars, int low ,int high){
        for (int i = low; i <high; i++) {
            if (chars[i] == chars[high])
                return false;
        }
        return true;
    }

    private void swap(char[] chars, int i, int k) {
        char temp=chars[k];
        chars[k]=chars[i];
        chars[i]=temp;
    }

    public static void main(String[] args) {
        _27_Permutation permutation=new _27_Permutation();
        ArrayList<String> a = permutation.Permutation("aba");
        System.out.println(a);
    }
}
