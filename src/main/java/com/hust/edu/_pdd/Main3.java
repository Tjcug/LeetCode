package com.hust.edu._pdd;

import java.util.Scanner;

/**
 * locate com.hust.edu._pdd
 * Created by MasterTj on 2019/3/10.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            int N= in.nextInt();
            int d= in .nextInt();
            int a[]=new int[N];
            int b[]=new int[N];
            for (int i = 0; i < N; i++) {
                a[i]=in.nextInt();
                b[i]=in.nextInt();
            }

            int max=Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {

            }
            System.out.println(max);
        }
    }
}
