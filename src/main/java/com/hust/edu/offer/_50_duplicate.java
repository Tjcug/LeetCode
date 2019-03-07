package com.hust.edu.offer;

import java.util.HashMap;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _50_duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int index=0;
        while (index<length){
            if(map.get(numbers[index])==null)
                map.put(numbers[index],1);
            else {
                Integer integer = map.get(numbers[index]);
                map.put(numbers[index],++integer);
                duplication[0]=numbers[index];
                return true;
            }
            index++;
        }
        return false;
    }
}
