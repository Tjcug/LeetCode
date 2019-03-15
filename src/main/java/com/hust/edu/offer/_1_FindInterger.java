package com.hust.edu.offer;

/**
 * locate com.hust.edu.sort
 * Created by MasterTj on 2019/2/28.
 * Offer1 二维数组中查找
 * 首先选取数组中右上角的数字。如果该数字等于要查找的数字，则返回true。
 * 如果该数字大于要查找的数字，则col--，如果该数字小于要查找的数字row++
 */
public class _1_FindInterger {
    public boolean Find(int target, int [][] array) {
        boolean find=false;
        if(array==null)
            return find;
        int rows=array.length;
        int cols=array[0].length;
        int row=0,col=cols-1;
        while (row<rows && col>=0){
            if(array[row][col]==target){
                find=true;
                break;
            }else if(array[row][col]>target)
                col--;
            else
                row++;
        }
        return find;
    }
}
