package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by MasterTj on 2018/11/20.
 * LetCode 83 deleteDuplicates 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */
public class _83_deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp=head;
        while (temp.next!=null){
            if(temp.next.val==temp.val){
                temp.next=temp.next.next;
            }else
                temp=temp.next;
        }
        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
