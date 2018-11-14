package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by MasterTj on 2018/11/14.
 */
public class _141_hasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) return true;
        }
        return false;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
