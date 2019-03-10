package com.hust.edu._pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * locate com.hust.edu._pdd
 * Created by MasterTj on 2019/3/10.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String lowerStr = str.toLowerCase();
            char[] chars = lowerStr.toCharArray();
            Arrays.sort(chars);

            System.out.println(chars[0]);
        }
    }}
