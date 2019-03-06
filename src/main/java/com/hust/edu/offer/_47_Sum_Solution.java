package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _47_Sum_Solution {
    public int Sum_Solution(int n) {
        if(n<1)
            return 0;
        int result=0;
        for (int i = 1; i <= n ; i++) {
            result+=i;
        }
        return result;
    }
}
