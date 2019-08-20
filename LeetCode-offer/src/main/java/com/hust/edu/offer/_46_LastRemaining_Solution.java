package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/13.
 * 圆圈中剩下的数字
 */
public class _46_LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (m == 0 || n == 0) {
            return -1;
        }
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        int index=0;
       while (data.size()>1){
           index = (index + m -1) % data.size();
           data.remove(index);
       }
       return data.get(0);
    }

    public static void main(String[] args) {
        _46_LastRemaining_Solution lastRemaining_solution=new _46_LastRemaining_Solution();
        int i = lastRemaining_solution.LastRemaining_Solution(5, 2);
        System.out.println(i);
    }
}
