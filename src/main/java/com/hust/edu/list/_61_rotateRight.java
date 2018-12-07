package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by MasterTj on 2018/12/7.
 * LetCode 61 旋转链表
 */
public class _61_rotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;

        ListNode temp=head;
        ListNode first=head;
        ListNode second=head;

        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int num=k%size;

        while (num > 0) {
            second=second.next;
            num--;
        }

        while (second.next!=null){
            first=first.next;
            second=second.next;
        }

        second.next=head;
        ListNode result=first.next;
        first.next=null;
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
