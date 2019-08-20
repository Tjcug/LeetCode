package com.hust.edu.stack;

import java.util.LinkedList;

/**
 * locate com.hust.edu.stack
 * Created by MasterTj on 2018/12/22.
 * 使用队列实现栈的下列操作
 */
public class _225_MyStack {
    class MyStack {
        private LinkedList<Integer> linkedList;

        /** Initialize your data structure here. */
        public MyStack() {
            linkedList=new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            linkedList.addFirst(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return linkedList.removeFirst();
        }

        /** Get the top element. */
        public int top() {
            return linkedList.getFirst();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return linkedList.size()==0;
        }
    }

}
