package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by mastertj on 2018/10/23.
 * 142 循环链表检测2
 */
public class _142_DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) break;
        }
        if(fast == null || fast.next==null) return null;
        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
