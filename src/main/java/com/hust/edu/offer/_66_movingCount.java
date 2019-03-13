package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/13.
 */
public class _66_movingCount {
    public int movingCount(int threshold, int rows, int cols) {
        if(rows<=0 || cols<=0)
            return 0;
        boolean[][] visited=new boolean[rows][cols];
        int count=movingCountHelper(threshold,rows,cols,0,0,visited);
        return count;
    }

    private int movingCountHelper(int threshold, int rows, int cols,int row,int col,boolean[][]visited){
        int count=0;
        if(check(threshold,rows,cols,row,col,visited)){
            visited[row][col]=true;
            count= 1+movingCountHelper(threshold,rows,cols,row+1,col,visited)+
                    movingCountHelper(threshold,rows,cols,row-1,col,visited)+
                    movingCountHelper(threshold,rows,cols,row,col+1,visited)+
                    movingCountHelper(threshold,rows,cols,row,col-1,visited);
        }
        return count;
    }

    private boolean check(int thread,int rows, int cols,int row, int col,boolean[][] visited){
        if(row<rows && row>=0 && col<cols && col>=0 && !visited[row][col]){
            return getNumnber(row) + getNumnber(col) <= thread;
        }
        return false;
    }

    private int getNumnber(int number){
        int sum=0;
        while (number>0){
            sum+=number%10;
            number=number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        _66_movingCount movingCount=new _66_movingCount();
        int count = movingCount.movingCount(5, 10, 10);
        System.out.println(count);
    }
}
