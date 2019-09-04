package com.hust.edu._xiecheng;

import java.util.Scanner;

/**
 * locate com.hust.edu._xiecheng
 * Created by MasterTj on 2019/9/4.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;

        while (in.hasNextInt()) {
            temp.next = new ListNode(in.nextInt());
            temp = temp.next;
        }
        partition(dummyHead.next,x);
        temp= dummyHead;
        while (temp.next!=null){
            System.out.print(temp.next.val+ " ");
        }
    }

    public static ListNode partition(ListNode head, long x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p1 = dummy1;
        ListNode p2 = dummy2;
        ListNode p = head;
        while (p != null) {
            if (p.val <= x) {
                p1.next = p;
                p1 = p1.next;
            } else {
                p2.next = p;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (dummy1.next == null) {
            return head;
        } else {
            p1.next = dummy2.next;
            p2.next = null;//需要断开
            return dummy1.next;
        }
    }

    private static class ListNode {
        long val;
        ListNode next;
        ListNode(long x) { val = x; }
    }
}
