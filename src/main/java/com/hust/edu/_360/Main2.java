package com.hust.edu._360;

import java.util.Scanner;

/**
 * locate com.hust.edu._360
 * Created by MasterTj on 2019/3/7.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] split = str1.split(" ");
        int N= Integer.parseInt(split[0]);
        int M= Integer.parseInt(split[1]);
        int K= Integer.parseInt(split[2]);
        int [][]number=new int[N][M];
        for (int i = 0; i < N; i++) {
            String str=scanner.nextLine();
            String[] splitNum = str.split(" ");
            number[i]=new int[M];
            for (int j = 0; j < splitNum.length; j++) {
                number[i][j]= Integer.parseInt(splitNum[j]);
            }
        }
        int result = getNumber(number, N, M, K);
        System.out.println(result);
    }

    public static int getNumber(int[][] number, int N, int M ,int K){
        return 2;
    }
}
