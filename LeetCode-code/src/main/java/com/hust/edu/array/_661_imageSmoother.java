package com.hust.edu.array;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 661. 图片平滑器
 * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，
 * 平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
 */
public class _661_imageSmoother {
    public int[][] imageSmoother(int[][] M) {
        if (M == null || M.length == 0 || M[0].length == 0) {
            return new int[][]{};
        }
        int row = M.length;
        int col = M[0].length;
        int[][] rsp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int pointCount = 0;
                int sum = 0;
                sum+=M[i][j];
                pointCount++;
                //获取周围的点
                if (i - 1 >= 0) {
                    sum += M[i - 1][j];
                    pointCount++;
                }
                if(i-1>=0 &&j-1>=0){
                    sum += M[i - 1][j-1];
                    pointCount++;
                }
                if(i-1>=0 &&j+1<col){
                    sum += M[i - 1][j+1];
                    pointCount++;
                }
                if (i + 1 < row) {
                    sum += M[i + 1][j];
                    pointCount++;
                }
                if (i + 1 < row && j-1>=0) {
                    sum += M[i + 1][j-1];
                    pointCount++;
                }
                if (i + 1 < row && j+1<col) {
                    sum += M[i + 1][j+1];
                    pointCount++;
                }
                if (j + 1 < col) {
                    sum += M[i][j+1];
                    pointCount++;
                }
                if (j - 1 >=0) {
                    sum += M[i][j-1];
                    pointCount++;
                }

                rsp[i][j] = sum / pointCount;
            }
        }
        return rsp;
    }
}
