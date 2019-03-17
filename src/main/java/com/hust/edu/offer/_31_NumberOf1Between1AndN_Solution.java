package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 找到整数中1出现的个数
 */
public class _31_NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int number=0;
        for (int i = 1; i <= n; i++) {
            number+=NumberOf1(i);
        }
        return number;
    }

    private int NumberOf1(int n) {
        int result=0;
        while (n!=0){
            if(n%10==1)
                result++;
            n=n/10;
        }
        return result;
    }

    public static void main(String[] args) {
        _31_NumberOf1Between1AndN_Solution numberOf1Between1AndN_solution=new _31_NumberOf1Between1AndN_Solution();
        int i = numberOf1Between1AndN_solution.NumberOf1Between1AndN_Solution(1);
        System.out.println(i);
    }
}
