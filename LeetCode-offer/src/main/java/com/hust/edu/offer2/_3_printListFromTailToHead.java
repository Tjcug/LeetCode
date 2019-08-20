package com.hust.edu.offer2;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _3_printListFromTailToHead {
    private ArrayList<Integer> arrayList=new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        printListFromTailToHeadHelper(listNode);
        return arrayList;
    }

    public void printListFromTailToHeadHelper(ListNode listNode) {
        if(listNode!=null) {
            printListFromTailToHeadHelper(listNode.next);
            arrayList.add(listNode.val);
        }
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
