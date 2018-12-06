package com.hust.edu.array;

import org.junit.Test;

import java.util.List;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2018/12/6.
 */
public class _54_spiralOrderTest {
    @Test
    public void spiralOrder() throws Exception {
        _54_spiralOrder spiralOrder=new _54_spiralOrder();
        int nums[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> list = spiralOrder.spiralOrder(nums);
        System.out.println(list);
    }

}
