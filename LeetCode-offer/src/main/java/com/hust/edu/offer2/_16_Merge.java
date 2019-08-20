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
       ListNode tempNode=dumpyNode;
       while (list1!=null && list2!=null){
           if(list1.val<=list2.val){
               tempNode.next=new ListNode(list1.val);
               list1=list1.next;
           }else {
               tempNode.next=new ListNode(list2.val);
               list2=list2.next;
           }
           tempNode=tempNode.next;
       }
       if(list1!=null){
           tempNode.next=list1;
       }else if(list2!=null)
           tempNode.next=list2;
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
