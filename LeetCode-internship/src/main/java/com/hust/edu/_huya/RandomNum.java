package com.hust.edu._huya;


import java.util.Scanner;
import java.util.TreeSet;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/4/29.
 */
public class RandomNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < num; i++) {
                int nextInt = in.nextInt();
                treeSet.add(nextInt);
            }
            for (Integer integer : treeSet) {
                System.out.println(integer);
            }
        }
    }
}
