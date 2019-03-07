package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/8.
 */
public class _55_EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode first=pHead;
        ListNode second=pHead;
        while (second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
            if(first==second)
                break;
        }
        if(second == null || second.next==null)
            return null;

        first=pHead;
        while (first!=second){
            first=first.next;
            second=second.next;
        }
        return second;
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
