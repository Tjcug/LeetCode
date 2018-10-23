package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by mastertj on 2018/10/23.
 * 删除链表的倒数第N个节点
 */
public class _19_RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumyNode=new ListNode(0);
        dumyNode.next=head;

        ListNode first=dumyNode;
        ListNode second=dumyNode;
        for(int i=0;i<n;i++){
            second=second.next;
        }

        while (second.next!=null){
            first=first.next;
            second=second.next;
        }

        first.next=first.next.next;

        return dumyNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
