package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 获取小最的k个数字
 * 基于最大堆来实现，时间复制度为O(nLogK)
 */
public class _29_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if(k>input.length || k==0)
            return list;
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < input.length; i++) {
            if(priorityQueue.size()<k){
                priorityQueue.add(input[i]);
            }else if(priorityQueue.peek()>input[i]){
                priorityQueue.poll();
                priorityQueue.add(input[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(priorityQueue.poll());
        }
        return list;
    }
}
