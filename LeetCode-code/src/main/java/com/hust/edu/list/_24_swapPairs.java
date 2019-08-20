package com.hust.edu.list;

/**
 * locate com.hust.com.hust.edu.list
 * Created by MasterTj on 2019/2/28.
 * LetCode 24 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 */
public class _24_swapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;

        ListNode dumpNode=new ListNode(0);
        dumpNode.next=head;

        ListNode headNode=dumpNode;
        ListNode firstNode=dumpNode.next;
        ListNode secondNode=firstNode.next;
        while (firstNode!=null && secondNode!=null){
            ListNode tempNode=secondNode.next;
            headNode.next=secondNode;
            secondNode.next=firstNode;
            firstNode.next=tempNode;

            headNode=firstNode;
            firstNode=headNode.next;
            if(firstNode==null)
                break;
            else
                secondNode=firstNode.next;
        }
        return dumpNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
