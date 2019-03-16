package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/2/28.
 */
public class _12_Power {
    public double Power(double base, int exponent) {
        if(exponent==0)
            return 1;
        if(base==0)
            return 0;
        boolean m_bool= exponent > 0;
        exponent=Math.abs(exponent);
        double result=1.0;
        for (int i = 0; i < exponent; i++) {
            result*=base;
        }
        if(m_bool) return result;
        else return 1/result;
    }
}
