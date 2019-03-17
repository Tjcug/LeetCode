package com.hust.edu.offer;

import java.util.Arrays;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/2/28.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class _13_reOrderArray {
    public void reOrderArray(int [] array) {
        if(array==null || array.length==0)
            return;
        int low=0;
        int high=array.length-1;
        while (low<high){
            //low 从0开始向后移动,直到它遇到偶数
            while (low<high && !Function(array[low])){
                low++;
            }
            //low 从arry.length-1开始向前移动,直到它遇到奇数
            while (low<high && Function(array[high])){
                high--;
            }
            if(low<high){
                int temp=array[high];
                array[high]=array[low];
                array[low]=temp;
            }
        }
    }

    public static boolean Function(int number){
        //是否是偶数
        return number%2==0;
    }

    public static void main(String[] args) {
        _13_reOrderArray reOrderArray=new _13_reOrderArray();
        int[] ints = {2, 4, 6, 1, 3, 5, 7};
        reOrderArray.reOrderArray(ints);
        System.out.println(Arrays.toString(ints));
    }
}
