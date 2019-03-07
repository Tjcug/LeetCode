package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _51_multiply {
    public int[] multiply(int[] A) {
        int[] result=new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int res=1;
            for (int j = 0; j < A.length; j++) {
                if(i!=j)
                    res*=A[j];
            }
            result[i]=res;
        }
        return result;
    }
}
