package com.hust.edu._360;

import java.util.Arrays;
import java.util.Scanner;

/**
 * locate com.hust.edu._360
 * Created by MasterTj on 2019/3/7.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            int M= scanner.nextInt();
            int a[] =new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
            }

            int max = getMax(a, M, N);
            System.out.println(max);
        }
        scanner.close();
    }

    public static int getMax(int[] a ,int M, int N){
        int singleCount= M-(N-M);
        Arrays.sort(a);
        int max = Integer.MIN_VALUE;
        int lastDouble = a.length - singleCount -1;
        int low=0;

        while (low < lastDouble){
            max = Math.max(a[low]+a[lastDouble],max);
            low++;
            lastDouble--;
        }
        return max;
    }
}
