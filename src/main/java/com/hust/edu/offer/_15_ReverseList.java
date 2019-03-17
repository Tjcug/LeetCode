package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/2/28.
 * 反转链表
 * 使用栈和递归
 */
public class _15_ReverseList {
//    public ListNode ReverseList(ListNode head) {
//        ListNode dumpyNode=head;
//        Stack<Integer> stack=new Stack<>();
//        while (dumpyNode!=null){
//            stack.add(dumpyNode.val);
//            dumpyNode=dumpyNode.next;
//        }
//        dumpyNode=new ListNode(0);
//        ListNode newHead=dumpyNode;
//        while (!stack.isEmpty()){
//            dumpyNode.next=new ListNode(stack.pop());
//            dumpyNode=dumpyNode.next;
//        }
//        return newHead.next;
//    }

    public ListNode ReverseList(ListNode head){
        if(head==null)
            return null;

        //反转链表的Head节点
        ListNode reverseHead= null;
        //当前遍历的节点
        ListNode pNode=head;
        //当前遍历的节点的前驱节点（实际上也是当前反转链表的头节点）
        ListNode prev=null;
        while (pNode!=null){
            ListNode pNext = pNode.next;

            if(pNext==null){
                reverseHead=pNode;
            }

            pNode.next=prev;
            prev=pNode;
            pNode = pNext;
        }
        return reverseHead;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
