package com.hust.edu._360;

import java.util.Scanner;

/**
 * locate com.hust.edu._360
 * Created by MasterTj on 2019/3/7.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int N= scanner.nextInt();
            int M= scanner.nextInt();
            int K= scanner.nextInt();
            int [][]number=new int[N][M];
            for (int i = 0; i < N; i++) {
                number[i]=new int[M];
                for (int j = 0; j < M; j++) {
                    number[i][j]= scanner.nextInt();
                }
            }
            int result = getNumber(number, N, M, K);
            System.out.println(result);
        }
       scanner.close();
    }

    public static int getNumber(int[][] number, int N, int M ,int K){
        return 2;
    }
}
