package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _51_multiply {
    public int[] multiply(int[] A) {
        int B[]=new int[A.length];
        int C[]=new int[A.length];
        int result[]=new int[A.length];
        if(A==null || A.length==0)
            return result;
        B[0]=1;
        for (int i = 1; i < A.length; i++) {
            B[i]=B[i-1]*A[i-1];
        }
        C[A.length-1]=1;
        for (int i = A.length-2; i >=0 ; i--) {
            C[i]=C[i+1]*A[i+1];
        }
        for (int i = 0; i < A.length; i++) {
            result[i]=B[i]*C[i];
        }
        return result;
    }

    public static void main(String[] args) {
        _51_multiply multiply=new _51_multiply();
        int[] multiply1 = multiply.multiply(new int[]{1, 2, 3, 4, 5});
        System.out.println(multiply);
    }
}
