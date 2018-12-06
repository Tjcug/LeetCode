package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2018/12/6.
 * LetCode238 除自身之外数组的乘积
 */
public class _238_productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int n1[]=new int[n];
        int n2[]=new int[n];
        n1[0]=1;
        n2[0]=1;
        int[] result=new int[n];
        for(int i=1;i<n;i++){
            n1[i]=nums[i-1]*n1[i-1];
            n2[i]=nums[n-i]*n2[i-1];
        }
        for(int i=0;i<n;i++){
            result[i]=n1[i]*n2[n-i-1];
        }
        return result;
    }
}
