package com.hust.edu.offer2;

/**
 * locate com.hust.edu.temp
 * Created by MasterTj on 2019/3/26.
 */
public class _1_Find {
    public boolean Find(int target, int [][] array) {
        if(array==null )
            return false;
        //取右上角开始操作
        int row=0,col=array[0].length-1;
        while (row<array.length && col>=0){
            if(array[row][col]==target)
                return true;
            else if(array[row][col]>target)
                col--;
            else
                row++;
        }
        return false;
    }
}
