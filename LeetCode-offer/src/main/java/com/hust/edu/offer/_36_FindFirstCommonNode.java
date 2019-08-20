package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _36_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null)
            return null;
        int length1=getListLegth(pHead1);
        int length2=getListLegth(pHead2);
        ListNode longList=null;
        ListNode shortList=null;
        int size=0;
        if(length1>length2){
            longList=pHead1;
            shortList=pHead2;
            size=length1-length2;
        }else {
            longList=pHead2;
            shortList=pHead1;
            size=length2-length1;
        }
        while (size>0){
            longList=longList.next;
            size--;
        }

        while (longList!=null && shortList!=null){
            if(longList==shortList)
                return longList;
            longList=longList.next;
            shortList=shortList.next;
        }
        return null;
    }

    private int getListLegth(ListNode listNode){
        if(listNode==null)
            return 0;
        int result=0;
        while (listNode!=null){
            result++;
            listNode=listNode.next;
        }
        return result;
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
