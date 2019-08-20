package com.hust.edu.sort;

/**
 * locate com.hust.com.hust.edu.sort
 * Created by MasterTj on 2018/12/10.
 * LetCode 147 对链表进行插入排序
 */
public class _147_insertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head==null)
            return null;

        ListNode dumpyNode=new ListNode(0);
        dumpyNode.next=new ListNode(head.val);
        ListNode temp=head.next;
        while (temp!=null){
            int val = temp.val;
            ListNode first=dumpyNode;
            ListNode second=dumpyNode.next;
            while (second!=null && val>second.val){
                first=first.next;
                second=second.next;
            }
            ListNode res=new ListNode(val);
            first.next=res;
            res.next=second;

            temp=temp.next;
        }
        return dumpyNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
