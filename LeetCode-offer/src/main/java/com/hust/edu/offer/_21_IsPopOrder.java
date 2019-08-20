package com.hust.edu.offer;

import java.util.Stack;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 */
public class _21_IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for (int i = 0; i < pushA.length; i++) {
            if(pushA[i]!=popA[j]){
                stack.push(pushA[i]);
            }else
                j++;
        }
        while (!stack.isEmpty()){
            if(stack.pop()!=popA[j])
                return false;
            else
                j++;
        }
        return true;
    }

    public static void main(String[] args) {
        _21_IsPopOrder isPopOrder=new _21_IsPopOrder();
        boolean b = isPopOrder.IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2});
        System.out.println(b);
    }
}
