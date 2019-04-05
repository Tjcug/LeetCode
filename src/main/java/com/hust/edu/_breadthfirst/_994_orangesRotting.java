package com.hust.edu._breadthfirst;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * locate com.hust.edu._breadthfirst
 * Created by MasterTj on 2019/4/5.
 * LetCode 994. 腐烂的橘子
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 */
public class _994_orangesRotting {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        boolean[][]visited=new boolean[rows][cols];
        Queue<Orange> orangeQueue=new ArrayDeque<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j]==2) {
                    orangeQueue.add(new Orange(i, j, grid[i][j]));
                    visited[i][j]=true;
                }
            }
        }

        int depth=-1;
        while (!orangeQueue.isEmpty()){
            depth++;
            int size = orangeQueue.size();
            for (int i = 0; i < size; i++) {
                Orange orange = orangeQueue.poll();
                //上
                if(orange.y-1>=0 && grid[orange.x][orange.y-1]==1 && !visited[orange.x][orange.y-1]){
                    orangeQueue.add(new Orange(orange.x,orange.y-1,2));
                    visited[orange.x][orange.y-1]=true;
                    grid[orange.x][orange.y-1]=2;
                }

                //下
                if(orange.y+1<cols && grid[orange.x][orange.y+1]==1 && !visited[orange.x][orange.y+1]){
                    orangeQueue.add(new Orange(orange.x,orange.y+1,2));
                    visited[orange.x][orange.y+1]=true;
                    grid[orange.x][orange.y+1]=2;
                }
                //左
                if(orange.x-1>=0 && grid[orange.x-1][orange.y]==1 && !visited[orange.x-1][orange.y]){
                    orangeQueue.add(new Orange(orange.x-1,orange.y,2));
                    visited[orange.x-1][orange.y]=true;
                    grid[orange.x-1][orange.y]=2;
                }
                //右
                if(orange.x+1<rows && grid[orange.x+1][orange.y]==1 && !visited[orange.x+1][orange.y]){
                    orangeQueue.add(new Orange(orange.x+1,orange.y,2));
                    visited[orange.x+1][orange.y]=true;
                    grid[orange.x+1][orange.y]=2;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j]==1) return -1;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j]!=0) return depth;
            }
        }
        return 0;
    }

    private class Orange{
        int x;
        int y;
        int val;

        public Orange(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        _994_orangesRotting orangesRotting=new _994_orangesRotting();
        int i = orangesRotting.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}});
        System.out.println(i);
    }
}
