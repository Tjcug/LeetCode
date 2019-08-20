package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 和为S的两个数字
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class _42_FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        int low=0;
        int high=array.length-1;
        while (high>low){
            int curSum=array[low]+array[high];
            if(curSum==sum){
                list.add(array[low]);
                list.add(array[high]);
                break;
            }else if(curSum<sum){
                low++;
            }else
                high--;
        }
        return list;
    }
}
