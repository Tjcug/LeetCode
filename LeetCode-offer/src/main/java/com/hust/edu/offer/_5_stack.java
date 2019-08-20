package com.hust.edu.offer;

import java.util.Stack;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 */
public class _5_stack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
