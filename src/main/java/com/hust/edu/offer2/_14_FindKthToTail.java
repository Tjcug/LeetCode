package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)
            return null;
        ListNode first=head;
        ListNode second=head;
        while (k>0){
            if(first==null)
                return null;
            first=first.next;
            k--;
        }
        while (first!=null){
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
