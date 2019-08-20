package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/12.
 * 滑动窗口的最大值
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}
 * 的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class _64_maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list=new ArrayList<>();
        if(size==0)
            return list;

        int low=0;
        int high=low+size-1;
        while (high<num.length){
            int maxVaule=Integer.MIN_VALUE;
            for (int i = low; i <=high ; i++) {
                maxVaule=Math.max(maxVaule,num[i]);
            }
            list.add(maxVaule);
            low++;
            high++;
        }
        return list;
    }
}
