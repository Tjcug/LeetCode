package com.hust.edu._vivo;

/**
 * locate com.hust.edu._vivo
 * Created by MasterTj on 2019/6/4.
 */
public class Main2 {
    public static void solution(ListNode head, int m, int n){
        if (head==null || m < 1 || m == n) return ;

        ListNode q = null;
        ListNode p = head;
        int count = 1;
        while(count < m && p!=null){
            q = p;
            p = p.next;
            ++count;
        }

        ListNode end = p;
        ListNode pre = p;
        ListNode pNext = null;
        p = p.next;
        for (count = m+1; count <= n; ++count){
            pNext = p. next;
            p.next = pre;
            pre = p;
            p = pNext;
        }

        end.next = p;

        if (q!=null){
            q.next = pre;
        }else{
            head = pre;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
