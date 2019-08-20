package com.hust.edu.offer;

import java.util.Stack;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 * 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 算法思路：利用辅助栈的思想实现，辅助栈中放入的元素是当前栈中元素的最小值。
 */
public class _20_MinStack {

    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(minStack.size()==0 || node<min())
            minStack.push(node);
        else
            minStack.push(min());

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
