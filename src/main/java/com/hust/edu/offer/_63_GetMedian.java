package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 */
public class _63_GetMedian {
    private ArrayList<Double> list=new ArrayList<>();

    public void Insert(Integer num) {
        list.add(Double.valueOf(num));
    }

    public Double GetMedian() {
        Collections.sort(list);
        int size = list.size();
        if(size%2==0){
            int n1=size/2-1;
            return ((list.get(n1) + list.get(n1+1)) / 2);
        }else {
            int n1=size/2-1;
            return (list.get(n1+1));
        }
    }
}
