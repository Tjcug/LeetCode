package com.hust.edu.array;

import org.junit.Test;

/**
 * locate com.hust.com.hust.edu.array
 * Created by MasterTj on 2018/12/3.
 */
public class _88_mergeTest {
    @Test
    public void merge() throws Exception {
        _88_merge merge=new _88_merge();
        int[] ints = {1, 2, 3, 0, 0, 0};
        merge.merge(ints,3,new int[]{2,5,6},3);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }

    }

}
