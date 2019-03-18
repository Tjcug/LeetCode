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
        ListNode temp=pHead;
        ListNode prev=dumpyNode;
        while (temp!=null && temp.next!=null){
            if (temp.val==temp.next.val){
                //如果相同则删除
                int val=temp.val;
                while (temp!=null && temp.val==val)
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
