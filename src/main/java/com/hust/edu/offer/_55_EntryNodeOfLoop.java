package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/8.
 * 链表中环入口的节点
 */
public class _55_EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null)
            return null;
        ListNode first=pHead;
        ListNode second=pHead;
        boolean m_bool=false;
        while (second.next!=null){
            first=first.next;
            second=second.next.next;
            if(first==second) {
                m_bool=true;
                break;
            }
        }
        if(!m_bool)
            return null;
        first=pHead;
        while (first!=second){
            first=first.next;
            second=second.next;
        }
        return first;
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
