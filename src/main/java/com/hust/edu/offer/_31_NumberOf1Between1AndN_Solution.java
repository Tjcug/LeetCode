package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _31_NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int number=0;
        for (int i = 0; i <= n; i++) {
            number+=NumberOf1(i);
        }
        return number;
    }

    public int NumberOf1(int n){
        int number=0;
        while (n!=0){
            if(n%10==1)
                number++;
            n=n/10;
        }
        return number;
    }

    public static void main(String[] args) {
        _31_NumberOf1Between1AndN_Solution numberOf1Between1AndN_solution=new _31_NumberOf1Between1AndN_Solution();
        int i = numberOf1Between1AndN_solution.NumberOf1Between1AndN_Solution(1);
        System.out.println(i);
    }
}
