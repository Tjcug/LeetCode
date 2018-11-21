package com.hust.edu.algorithm;

/**
 * locate com.hust.edu.algorithm
 * Created by MasterTj on 2018/11/21.
 * LetCode 11 盛最多水的容器
 */
public class _11_maxArea {
    public int maxArea(int[] height) {
        int result=Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                result= Math.max(result,Math.min(height[j],height[i])*(j-i));
            }
        }
        return result;
    }
}
