package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 和为S的连续正数序列
 */
public class _41_FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(sum < 3) return result;
        int low=1;
        int high=2;
        //设置middle变量的原因在于如果在当前总和小于sum的情况下，
        //small在增加到sum的一半的过程中肯定会大于sum
        int mid=(sum+1)/2;
        int curSum=low+high;
        while (low<mid){
            if(curSum==sum)
                addResultFromLowToHigh(result,low,high);
            while (curSum > sum && low<mid){
                curSum-=low;
                low++;
                if(curSum==sum)
                    addResultFromLowToHigh(result,low,high);
            }
            high++;
            curSum+=high;
        }
        return result;
    }

    public void addResultFromLowToHigh(ArrayList<ArrayList<Integer>> result, int low, int high){
        ArrayList arrayList=new ArrayList();
        for (int i = low; i <= high; i++) {
            arrayList.add(i);
        }
        result.add(arrayList);
        return;
    }
}
