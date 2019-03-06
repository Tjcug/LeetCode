package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _27_Permutation {
    private ArrayList<String> list=new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if(str.length()==0)
            return list;
        PermutationHelper(str.toCharArray(),0);
        //去重复元素
        Set<String> set=new HashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        Collections.sort(list);
        return list;
    }

    private void PermutationHelper(char[] str, int i){
        if (i >= str.length)
            return;
        if (i == str.length - 1) {
            list.add(String.valueOf(str));
        } else {
            for (int j = i; j < str.length; j++) {
                    char temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;

                    PermutationHelper(str, i + 1);

                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        _27_Permutation permutation=new _27_Permutation();
        ArrayList<String> a = permutation.Permutation("aba");
        System.out.println(a);
    }
}
