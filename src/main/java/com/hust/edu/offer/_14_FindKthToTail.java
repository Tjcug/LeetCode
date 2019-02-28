package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/2/28.
 */
public class _14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)
            return null;

        ListNode first=head;
        ListNode second=head;
        while (k>0){
            if(second==null)
                return null;
            second=second.next;
            k--;
        }
        while (second!=null){
            first=first.next;
            second=second.next;
        }
        return first;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
