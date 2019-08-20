package com.hust.edu.array;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 118. 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */
public class _118_generate {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0)
            return result;
        List<Integer> first=new ArrayList<>();
        first.add(1);
        result.add(first);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> list=new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0 || j==i-1) list.add(1);
                else {
                    List<Integer> frontList = result.get(result.size() - 1);
                    list.add(frontList.get(j)+frontList.get(j-1));
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = _118_generate.generate(5);
    }
}
