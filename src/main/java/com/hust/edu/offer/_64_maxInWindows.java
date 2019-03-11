package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/12.
 */
public class _64_maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list=new ArrayList<>();
        if(size==0)
            return list;

        int n1=0;
        int n2=n1+size-1;
        while (n2<num.length){
            int max= Integer.MIN_VALUE;
            for (int i = n1; i <= n2; i++) {
                max=Math.max(max,num[i]);
            }
            list.add(max);
            n1++;
            n2++;
        }
        return list;
    }
}
