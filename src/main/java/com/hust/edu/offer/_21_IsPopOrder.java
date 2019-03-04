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
            stack.push(pushA[i]);
            if(pushA[i]==popA[j]){
                stack.pop();
                if(++j==popA.length)
                    return true;
            }
        }

        while (!stack.isEmpty()){
            if(stack.pop()!=popA[j])
                return false;
            else
                j++;
        }
        return true;
    }
}
