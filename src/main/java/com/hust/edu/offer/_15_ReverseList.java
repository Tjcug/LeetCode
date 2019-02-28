package com.hust.edu.offer;

import java.util.Stack;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/2/28.
 */
public class _15_ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode dumpyNode=head;
        Stack<Integer> stack=new Stack<>();
        while (dumpyNode!=null){
            stack.add(dumpyNode.val);
            dumpyNode=dumpyNode.next;
        }
        dumpyNode=new ListNode(0);
        ListNode newHead=dumpyNode;
        while (!stack.isEmpty()){
            dumpyNode.next=new ListNode(stack.pop());
            dumpyNode=dumpyNode.next;
        }
        return newHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
