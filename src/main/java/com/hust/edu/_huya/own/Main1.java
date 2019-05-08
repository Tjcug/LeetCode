package com.hust.edu._huya.own;

import java.util.Scanner;

/**
 * locate com.hust.edu._huya.own
 * Created by mastertj on 2019/5/8.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N=in.nextInt();
            int[][] range=new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    range[i][j]=in.nextInt();
                }
            }
            int times=in.nextInt()%4;
            for (int i = 0; i < times; i++) {
                reverseRange(range);
                exchangeRange(range);
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(range[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
    
    public static void reverseRange(int [][] range){
        for (int i = 0; i < range.length; i++) {
            for (int j = i; j < range.length; j++) {
                int temp=range[i][j];
                range[i][j]=range[j][i];
                range[j][i]=temp;
            }
        }
    }
    public static void exchangeRange(int [][]range){
        int row=0;
        int col=range.length-1;
        for (int i = 0; i < range.length/2; i++) {
            for (int j = 0; j < range.length; j++) {
                int temp=range[j][row];
                range[j][row]=range[j][col];
                range[j][col]=temp;
            }
            row++;
            col--;
        }
    }
}
