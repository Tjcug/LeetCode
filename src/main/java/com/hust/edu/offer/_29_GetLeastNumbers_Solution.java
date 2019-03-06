package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _29_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        if(k > input.length)
            return result;
        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }
        Collections.sort(list);

        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }

        return result;
    }
}
