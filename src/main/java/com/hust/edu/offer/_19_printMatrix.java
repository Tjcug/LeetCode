package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 */
public class _19_printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row=matrix.length;//行数
        int collor=matrix[0].length;//列数
        ArrayList arrayList=new ArrayList();
        //计算打印的圈数
        int circle=((row<collor?row:collor)-1)/2+1;//圈数
        for (int i = 0; i < circle; i++) {
            //从左向右打印
            for (int j = i; j < collor-i; j++) {
                arrayList.add(matrix[i][j]);
            }
            //从上向下打印
            for (int k = i+1; k < row-i; k++) {
                arrayList.add(matrix[k][collor-i-1]);
            }
            //从右向左打印,除去重复元素 row-2*i-1!=0 根据上面从上向下打印可得
            if(row-2*i-1!=0) {
                for (int z = collor - 2 - i; z > i; z--) {
                    arrayList.add(matrix[row - 1 - i][z]);
                }
            }

            //从下向上打印，除去重复元素 根据上面从左向右打印可得
            if(collor-2*i-1!=0) {
                for (int m = row - i - 1; m > i; m--) {
                    arrayList.add(matrix[m][i]);
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
