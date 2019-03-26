package com.hust.edu.offer2;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _3_printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        printListFromTailToHeadHelper(listNode,list);
        return list;
    }

    private void printListFromTailToHeadHelper(ListNode listNode,ArrayList<Integer> list){
        if(listNode==null)
            return;
        printListFromTailToHeadHelper(listNode.next,list);
        list.add(listNode.val);
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
