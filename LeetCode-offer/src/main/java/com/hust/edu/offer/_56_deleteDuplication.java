package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/10.
 */
public class _56_deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
       if(pHead==null)
           return null;

       ListNode dumpyNode=new ListNode(-1);
       dumpyNode.next=pHead;
       ListNode temp=dumpyNode.next;
       ListNode prev=dumpyNode;
       while (temp!=null && temp.next!=null){
           if(temp.val==temp.next.val){
                //如果相同就删除
               int var=temp.val;
               while (temp!=null && temp.val==var)
                   temp=temp.next;

               prev.next=temp;
           }else {
               temp=temp.next;
               prev=prev.next;
           }
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
