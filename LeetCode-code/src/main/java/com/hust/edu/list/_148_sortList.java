package com.hust.edu.list;

/**
 * locate com.hust.com.hust.edu.list
 * Created by MasterTj on 2018/12/4.
 * LetCode 148 排序链表在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 */
public class _148_sortList {
    public ListNode sortList(ListNode head) {
        quickSort(head,null);
        return head;
    }

    //快速排序
    public static void quickSort(ListNode begin, ListNode end){
        if(begin == null || begin == end)
            return;

        ListNode index = paration(begin, end);
        quickSort(begin, index);
        quickSort(index.next, end);
    }

    /**
     * 划分函数，以头结点值为基准元素进行划分
     * @param begin
     * @param end
     * @return
     */
    public static ListNode paration(ListNode begin, ListNode end){
        if(begin == null || begin == end)
            return begin;

        int val = begin.val;  //基准元素
        ListNode index = begin, cur = begin.next;

        while(cur != end){
            if(cur.val < val){  //交换
                index = index.next;
                int tmp = cur.val;
                cur.val = index.val;
                index.val = tmp;
            }
            cur = cur.next;
        }


        begin.val = index.val;
        index.val = val;

        return index;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
