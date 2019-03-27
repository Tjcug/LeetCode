package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _15_ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null ;
        ListNode dumpyNode=new ListNode(-1);
        while (head!=null){
            ListNode reverseHead = dumpyNode.next;
            ListNode temp=head.next;

            head.next=reverseHead;
            dumpyNode.next=head;
            head=temp;
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
