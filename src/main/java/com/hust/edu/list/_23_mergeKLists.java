package com.hust.edu.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * locate com.hust.edu.list
 * Created by MasterTj on 2018/11/16.
 * LetCode 23 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 */
public class _23_mergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
       ListNode dumpyNode= new ListNode(0);
       ListNode temp=dumpyNode;
       List<Integer> list=new ArrayList<>();
        for (ListNode tempNode : lists) {
            while (tempNode!=null){
                list.add(tempNode.val);
                tempNode=tempNode.next;
            }
        }
        Collections.sort(list);
        for (Integer integer : list) {
            temp.next=new ListNode(integer);
            temp=temp.next;
        }
        return dumpyNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
