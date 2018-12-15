package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by MasterTj on 2018/12/15.
 * LetCode 876 链表的中间结点
 */
public class _876_middleNode {
    public ListNode middleNode(ListNode head) {
        ListNode low=head;
        ListNode fast=head;
        while (fast!=null && (fast.next)!=null){
            low=low.next;
            fast=fast.next.next;
        }
        return low;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
