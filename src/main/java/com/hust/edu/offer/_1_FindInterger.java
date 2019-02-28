package com.hust.edu.offer;

import java.util.Arrays;

/**
 * locate com.hust.edu.sort
 * Created by MasterTj on 2019/2/28.
 */
public class _1_FindInterger {
    public boolean Find(int target, int [][] array) {
        int result= -1;
        for (int i = 0; i < array.length; i++) {
            result = Arrays.binarySearch(array[i], target);
            if(result>=0)
                break;
        }
        return result>=0;
    }
}
