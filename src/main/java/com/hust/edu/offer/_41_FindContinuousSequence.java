package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _41_FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> sqList = new ArrayList<ArrayList<Integer>>();
        if(sum < 3) return sqList;
        int small = 1;
        int big = 2;
        int curSum = small + big;
        //设置middle变量的原因在于如果在当前总和小于sum的情况下，
        //small在增加到sum的一半的过程中肯定会大于sum
        int middle = (1 + sum) / 2;
        while (small<middle){
            ArrayList<Integer> sq=new ArrayList<>();
            if(curSum == sum){
                for (int i = small; i <=big; i++) {
                    sq.add(i);
                }
            }
            while (curSum > sum && small< middle){
                curSum -=small;
                small++;
                if(curSum == sum){
                    for (int i = small; i <= big; i++) {
                        sq.add(i);
                    }
                }
            }

            if(sq.size()>0) sqList.add(sq);
            big++;
            curSum+=big;
        }
        return sqList;
    }
}
