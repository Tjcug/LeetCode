package com.hust.edu.stack;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * locate com.hust.edu.stack
 * Created by MasterTj on 2018/11/16.
 */
public class _155_MinStack {
    private Queue<Integer> minQueue;

    private ListNode head;
    /** initialize your data structure here. */
    public _155_MinStack() {
        minQueue=new PriorityQueue<>();
        head=new ListNode(0);
    }

    public void push(int x) {
        minQueue.add(x);
        ListNode temp=new ListNode(x);
        temp.next=head.next;
        head.next=temp;
    }

    public void pop() {
        int top = head.next.val;
        head.next=head.next.next;
        minQueue.remove(top);
    }

    public int top() {
        return head.next.val;
    }

    public int getMin() {
        return minQueue.peek();
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
