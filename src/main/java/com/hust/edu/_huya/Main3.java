package com.hust.edu._huya;

import java.util.Scanner;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/4/10.
 */
public class Main3 {
    private static int path=0;

    private static void findPath(int row,int col,int rows,int cols, int map[][],boolean[][] visited,int XB,int YB){
        if(row==XB && col==YB){
            path++;
            visited[row][col]=false;
            return ;
        }

        int val = map[row][col];
        visited[row][col]=true;
        if(row-1>=0){
            if(map[row-1][col]>val && !visited[row-1][col]){
                findPath(row-1,col,rows,cols,map,visited,XB,YB);
            }
        }

        if(row+1<rows){
            if(map[row+1][col]>val && !visited[row+1][col]){
                findPath(row+1,col,rows,cols,map,visited,XB,YB);
            }
        }

        if(col-1>=0){
            if(map[row][col-1]>val && !visited[row][col-1]){
                findPath(row,col-1,rows,cols,map,visited,XB,YB);
            }
        }

        if(col+1<cols){
            if(map[row][col+1]>val && !visited[row][col+1]){
                findPath(row,col+1,rows,cols,map,visited,XB,YB);
            }
        }
        visited[row][col]=false;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int N=in.nextInt();
            int M=in.nextInt();
            boolean[][] visited=new boolean[N][M];
            int[][] map=new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    map[i][j]=in.nextInt();
                }
            }

            int XA=in.nextInt();
            int YA=in.nextInt();
            int XB=in.nextInt();
            int YB=in.nextInt();
            findPath(YA,XA,N,M,map,visited,XB,YB);
            System.out.println(path%1000000000);
        }
    }
}
