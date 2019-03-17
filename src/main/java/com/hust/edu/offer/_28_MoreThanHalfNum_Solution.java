package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 判断是否超过原来数字的一半
 */
public class _28_MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0)
            return 0;
        if(array.length==1)
            return array[0];
        int result=array[1];
        int times=1;
        for (int i = 0; i < array.length; i++) {
            if(times==0){
                result=array[i];
                times=1;
            }else if(array[i]==result)
                times++;
            else times--;
        }
        if(!CheckMoreThanHalf(array,result))
            return 0;
        return result;
    }

    private boolean CheckMoreThanHalf(int array[],int target){
        int times=0;
        int size=array.length/2;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==target)
                times++;
        }
        return times>size;
    }
}
