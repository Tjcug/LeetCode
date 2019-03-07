package com.hust.edu._360;

import java.util.*;

/**
 * locate com.hust.edu._360
 * Created by MasterTj on 2019/3/7.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] split1 = str1.split(" ");
        String str2 = scanner.nextLine();
        String[] split2 = str2.split(" ");
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < split2.length; i++) {
            list.add(Integer.valueOf(split2[i]));
        }
        int min = getMin(list, Integer.valueOf(split1[0]), Integer.valueOf(split1[1]));
        System.out.println(min);
    }

    public static int getMin(List<Integer> list, int M, int N){
        Collections.sort(list);
        int temp=N-M/2;
        List<Integer> subList = list.subList(0, list.size()-temp);
        return subList.get(0)+subList.get(subList.size()-1);
    }
}
