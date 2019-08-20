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

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
