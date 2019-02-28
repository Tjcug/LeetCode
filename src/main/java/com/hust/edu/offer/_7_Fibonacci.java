package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 */
public class _7_Fibonacci {
    public int Fibonacci(int n) {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
