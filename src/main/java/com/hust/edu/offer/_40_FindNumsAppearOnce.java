package com.hust.edu.offer;

import java.util.Arrays;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _40_FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        int size=1;
        boolean m_bool=true;
        for (int i = 1; i < array.length; i++) {
           if(array[i-1]==array[i]){
               size++;
           }else {
               if(size==1){
                   if(m_bool){
                       num1[0]=array[i-1];
                       m_bool=false;
                   }else {
                       num2[0]=array[i-1];
                   }
               }
               size=1;
           }
        }
        if(size==1)
            num2[0]=array[array.length-1];
    }

    public static void main(String[] args) {
        _40_FindNumsAppearOnce findNumsAppearOnce=new _40_FindNumsAppearOnce();
        int num1[] =new int[1];
        int num2[] =new int[1];
        findNumsAppearOnce.FindNumsAppearOnce(new int[]{2,4,3,6,3,2,5,5},num1,num2);
        System.out.println(num1[0]+" "+num2[0]);
    }
}
