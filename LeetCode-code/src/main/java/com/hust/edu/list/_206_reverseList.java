package com.hust.edu.list;

import java.util.Stack;

/**
 * locate com.hust.com.hust.edu.list
 * Created by MasterTj on 2018/11/20.
 * LetCode 206 反转一个单链表。
 */
public class _206_reverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;

        ListNode temp= head;
        Stack<Integer> stack=new Stack<>();
        while (temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }

        ListNode dumpyNode= new ListNode(0);
        temp=dumpyNode;
        while (!stack.isEmpty()){
            Integer pop = stack.pop();
            System.out.println(pop);
            temp.next=new ListNode(pop);
            temp=temp.next;
        }
        return dumpyNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
