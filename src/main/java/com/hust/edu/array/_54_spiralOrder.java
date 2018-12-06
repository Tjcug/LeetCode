package com.hust.edu.array;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2018/12/6.
 * LetCode 54 螺旋矩阵 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 */
public class _54_spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList=new ArrayList<>();
        if(matrix.length==0)
            return resultList;

        spiralOrderHelper(matrix,resultList,0, matrix[0].length-1, 0, matrix.length-1);
        return resultList;
    }

    private void spiralOrderHelper(int[][] matrix, List<Integer> result, int m1, int m2, int n1,int n2){
        if(m1>m2 || n1>n2)
            return;
        if(m1==m2 && n1==n2 && m1==n1){
            result.add(matrix[m1][n1]);
            return;
        }

        if(m1==m2){
            for (int i = n1; i <= n2 ; i++) {
                result.add(matrix[i][m1]);
            }
            return;
        }

        if(n1==n2){
            for (int i = m1; i <= m2 ; i++) {
                result.add(matrix[n1][i]);
            }
            return;
        }

        for (int j = m1; j <= m2 ; j++) {
            result.add(matrix[m1][j]);
        }
        for (int i = n1+1; i < n2; i++) {
            result.add(matrix[i][m2]);
        }
        for (int j = m2; j >= m1 ; j--) {
            result.add(matrix[n2][j]);
        }
        for (int i = n2-1; i > n1 ; i--) {
            result.add(matrix[i][m1]);
        }
        spiralOrderHelper(matrix,result,m1+1,m2-1,n1+1,n2-1);
    }
}
