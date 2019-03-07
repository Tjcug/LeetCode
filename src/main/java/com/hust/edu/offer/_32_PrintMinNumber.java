package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _32_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1=o1+o2;
                String str2=o2+o1;
                return str1.compareTo(str2);
            }
        });
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        _32_PrintMinNumber printMinNumber=new _32_PrintMinNumber();
        String s = printMinNumber.PrintMinNumber(new int[]{3,323,32123,222222});
        System.out.println(s);
    }
}
