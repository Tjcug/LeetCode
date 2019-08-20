package com.hust.edu.array;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/12/6.
 * LetCode 59 螺旋矩阵2 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 */
public class _59_generateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int total = n*n;
        int num = 1;

        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;

        while(num <= total)
        {
            // traverse right (y changes)
            for(int y=colBegin; y<=colEnd; y++)
                res[rowBegin][y] = num++;

            rowBegin++; // move down one row

            // traverse down (x changes)
            for(int x=rowBegin; x<=rowEnd; x++)
                res[x][colEnd] = num++;

            colEnd--; // move left one column

            // traverse left (y changes)
            for(int y=colEnd; y>=colBegin; y--)
                res[rowEnd][y] = num++;

            rowEnd--; // move up one row

            // traverse up (x changes)
            for(int x=rowEnd; x>=rowBegin; x--)
                res[x][colBegin] = num++;

            colBegin++; // move right one column

        }

        return res;
    }
}
