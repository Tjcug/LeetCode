package com.hust.edu.offer2;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _13_reOrderArray {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> aList=new ArrayList<>();
        ArrayList<Integer> bList=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                aList.add(array[i]);
            }else
                bList.add(array[i]);
        }
        aList.addAll(bList);
        for (int i = 0; i < aList.size(); i++) {
            array[i]=aList.get(i);
        }
    }
}
