package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by MasterTj on 2018/12/6.
 * LetCode 160 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class _160_getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != node2) {
            node1 = (node1 == null ? headB : node1.next);
            node2 = (node2 == null ? headA : node2.next);
        }
        return node1;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
