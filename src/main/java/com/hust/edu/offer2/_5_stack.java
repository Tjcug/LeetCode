package com.hust.edu.offer2;

import java.util.Stack;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _5_stack {

    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();

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
