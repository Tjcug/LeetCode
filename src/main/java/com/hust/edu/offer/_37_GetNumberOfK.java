package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 统计一个数字在排序数组中出现的次数。
 */
public class _37_GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int size=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==k){
                size++;
            }
        }
        return size;
    }
}
