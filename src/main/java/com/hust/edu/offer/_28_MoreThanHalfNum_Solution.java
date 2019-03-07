package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _28_MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==1)
            return array[0];
        int size=array.length/2;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);
        int temp=list.get(0);
        int t=0;
        for (int i = 1; i < list.size(); i++) {
            if(temp==list.get(i))
                t++;
            else {
                if(t >= size){
                    return temp;
                }
                temp = list.get(i);
                t=0;
            }
        }
        return 0;
    }
}
