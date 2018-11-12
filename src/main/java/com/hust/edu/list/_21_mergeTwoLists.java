package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by MasterTj on 2018/11/12.
 */
public class _21_mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dumyNode = new ListNode(0);
        ListNode temp =dumyNode;
        while (l1 !=null && l2 !=null){
            if(l1.val <= l2.val){
                temp.next=new ListNode(l1.val);
                l1=l1.next;
            }else {
                temp.next=new ListNode(l2.val);
                l2=l2.next;
            }
            temp=temp.next;
        }

        while (l1 !=null){
            temp.next=new ListNode(l1.val);
            l1=l1.next;
            temp=temp.next;
        }

        while (l2 !=null){
            temp.next=new ListNode(l2.val);
            l2=l2.next;
            temp=temp.next;
        }

        return dumyNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
