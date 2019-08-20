package com.hust.edu.list;

/**
 * locate com.hust.com.hust.edu.list
 * Created by mastertj on 2018/10/30.
 */
public class _237_deleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
