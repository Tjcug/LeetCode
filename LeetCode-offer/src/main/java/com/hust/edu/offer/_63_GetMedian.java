package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 * 数据流中的中位数
 * 如何得到一个数据流中的中位数？
 */
public class _63_GetMedian {
    private ArrayList<Double> list=new ArrayList<>();

    public void Insert(Integer num) {
        list.add(Double.valueOf(num));
    }

    public Double GetMedian() {
        Collections.sort(list);
        int size = list.size();
        int mid=size/2;
        if(size%2==0){
            int n1=mid-1;
            int n2=mid;
            return ((list.get(n1) + list.get(n2)) / 2);
        }else {
            return (list.get(mid));
        }
    }
}
