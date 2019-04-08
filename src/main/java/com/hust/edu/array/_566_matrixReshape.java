package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2019/4/8.
 * 566. 重塑矩阵
 * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
 *
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充
 *
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 */
public class _566_matrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows=nums.length;
        int cols=nums[0].length;
        int res[][]=new int[r][c];
        if(rows*cols!=r*c)return nums;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index=i*cols+j;
                int num=index/c;
                int mod=index%c;
                res[num][mod]=nums[i][j];
            }
        }
        return res;
    }
}
