package com.hust.edu.list;

import java.util.LinkedList;

/**
 * locate com.hust.com.hust.edu.list
 * Created by MasterTj on 2018/12/8.
 * LetCode 234 回文链表
 */
public class _234_isPalindrome {
    public boolean isPalindrome(ListNode head) {
        LinkedList<Integer> nodeVal=new LinkedList<>();

        if(head==null||head.next==null)
            return true;
        ListNode slow=head;
        ListNode fast=head;

        nodeVal.add(0,slow.val);
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            nodeVal.add(0,slow.val);
        }

        ListNode cur=slow;
        if(fast.next!=null)//链表长度为偶数
            cur=slow.next;
        int i=0;
        while(cur!=null)
        {
            if(nodeVal.get(i)!=cur.val)
                return false;
            cur=cur.next;
            i++;
        }
        return true;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
