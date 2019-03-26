package com.hust.edu.offer2;

import java.util.Stack;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _20_minStack {
    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> minstack=new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(minstack.isEmpty()){
            minstack.push(node);
        }else {
            if(node<minstack.peek())
                minstack.push(node);
            else
                minstack.push(minstack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minstack.peek();
    }
}
