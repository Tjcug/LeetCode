package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _35_InversePairs {
    public int InversePairs(int [] array) {
        int result=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[i])
                    result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _35_InversePairs inversePairs=new _35_InversePairs();
        int i = inversePairs.InversePairs(new int[]{7, 5, 6, 4});
        System.out.println(i);
    }
}
