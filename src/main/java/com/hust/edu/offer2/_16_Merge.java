package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _16_Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode dumpyNode=new ListNode(-1);
        ListNode temp=dumpyNode;
        while (list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
            }else {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }

        while (list1!=null){
            temp.next=list1;
            list1=list1.next;
            temp=temp.next;
        }

        while (list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
        return dumpyNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
