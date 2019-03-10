package com.hust.edu._pdd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * locate com.hust.edu._pdd
 * Created by MasterTj on 2019/3/10.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            int N= in.nextInt();
            Integer a[]=new Integer[N];
            Integer b[]=new Integer[N];
            for (int i = 0; i < N; i++) {
                a[i]=in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                b[i]=in.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b, Collections.reverseOrder());
            int reuslt=0;
            for (int i = 0; i < N; i++) {
                reuslt+=a[i]*b[i];
            }
            System.out.println(reuslt);
        }
    }
}
