package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/10.
 */
public class _56_deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode dumpyNode = new ListNode(-1);//设置一个trick

        dumpyNode.next = pHead;

        ListNode p = pHead;
        ListNode second = dumpyNode;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                int val = p.val;
                while (p!= null&&p.val == val)
                    p = p.next;
                second.next = p;
            } else {
                second = p;
                p = p.next;
            }
        }
        return dumpyNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
