package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/16.
 */
public class DeleteNode {
    public static boolean deleteNode(ListNode head,int ptBeDeleted){
        ListNode temp=head;
        ListNode dumpyNode=new ListNode(-1);
        dumpyNode.next=head;
        while (temp!=null){
            if(temp.val==ptBeDeleted){
                dumpyNode.next=temp.next;
                return true;
            }
            temp=temp.next;
            dumpyNode=dumpyNode.next;
        }
        return false;
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    };

    public static void main(String[] args) {
        ListNode listNode=new ListNode(0);
        ListNode temp=listNode;
        for (int i = 0; i < 10; i++) {
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        boolean b = DeleteNode.deleteNode(listNode, 5);
        System.out.println(b);
    }
}
