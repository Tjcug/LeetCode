package com.hust.edu._zjtd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * locate com.hust.edu._zjtd
 * Created by MasterTj on 2019/3/16.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            int M = in.nextInt();
            int array[]=new int[N];
            for (int i = 0; i < N; i++) {
                array[i]=in.nextInt();
            }
            int minSize = findMinSize(array, N, M);
            System.out.println(minSize);

        }
    }

    public static int findMinSize(int[]array, int N, int M){
        Arrays.sort(array);
        if(N>=M){
            return array[array.length-M];
        }else{

            return 0;
        }
    }
}
