package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 * 顺时针打印矩阵
 */
public class _19_printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int rows=matrix.length;//行数
        int cols=matrix[0].length;//列数
        int circle=((rows>cols?cols:rows)-1)/2+1;
        for (int i = 0; i < circle; i++) {
            //从左到右打印
            for (int j = i; j < cols-i; j++) {
                arrayList.add(matrix[i][j]);
            }
            //从上向下打印
            for (int j = i+1; j <rows-i; j++) {
                arrayList.add(matrix[j][cols-1-i]);
            }
            //从右向左打印,去取重复元素
            if(rows-2-2*i>0){
                for (int j = cols-i-2; j >=i ; j--) {
                    arrayList.add(matrix[rows-i-1][j]);
                }
            }
            //从下向上打印,去取重复元素
            if(cols-2*i-1>0){
                for (int j = rows-2-i; j >i ; j--) {
                    arrayList.add(matrix[j][i]);
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        _19_printMatrix printMatrix=new _19_printMatrix();
        ArrayList<Integer> integers = printMatrix.printMatrix(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}});
        System.out.println(integers);
        ArrayList<Integer> integers1 = printMatrix.printMatrix(new int[][]{{1, 2, 3, 4, 5}});
        System.out.println(integers1);
        ArrayList<Integer> integers2 = printMatrix.printMatrix(new int[][]{{1}, {2}, {3}, {4}, {5}});
        System.out.println(integers2);
    }
}
