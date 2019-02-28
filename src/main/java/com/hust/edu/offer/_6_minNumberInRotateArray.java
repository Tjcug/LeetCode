package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 */
public class _6_minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0)
            return 0;

        int minNumber=-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>array[i+1]){
                minNumber=array[i+1];
                break;
            }
        }
        return minNumber;
    }
}
