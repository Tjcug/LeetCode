package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/1.
 */
public class _16_Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode resultList=new ListNode(0);
        ListNode dumpyNode=resultList;
        ListNode firstList=list1;
        ListNode secondList=list2;
        while (firstList!=null && secondList!=null){
            if(firstList.val<=secondList.val){
                dumpyNode.next=new ListNode(firstList.val);
                firstList=firstList.next;
            }else {
                dumpyNode.next=new ListNode(secondList.val);
                secondList=secondList.next;
            }

            dumpyNode=dumpyNode.next;
        }

        while (firstList!=null){
            dumpyNode.next=new ListNode(firstList.val);
            firstList=firstList.next;
            dumpyNode=dumpyNode.next;
        }

        while (secondList!=null){
            dumpyNode.next=new ListNode(secondList.val);
            secondList=secondList.next;
            dumpyNode=dumpyNode.next;
        }

        return resultList.next;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
