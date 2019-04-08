package com.hust.edu.array;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 119. 杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 */
public class _119_getRow {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> first=new ArrayList<>();
        first.add(1);
        result.add(first);
        if(rowIndex==0)
            return first;
        for (int i = 2; i <= rowIndex+1; i++) {
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
        return result.get(rowIndex);
    }

    public static void main(String[] args) {
        List<Integer> row = _119_getRow.getRow(3);
    }
}
