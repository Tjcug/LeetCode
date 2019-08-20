package com.hust.edu.list;

/**
 * locate com.hust.com.hust.edu.list
 * Created by MasterTj on 2018/11/22.
 * LetCode203 删除链表中等于给定值 val 的所有节点。
 */
public class _203_removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null)
            return head;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
