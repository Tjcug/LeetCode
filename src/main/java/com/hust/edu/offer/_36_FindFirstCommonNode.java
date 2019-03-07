package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _36_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null)
            return null;

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        ListNode first=pHead1;
        while (first!=null){
            list1.add(first.val);
            first=first.next;
        }
        ListNode second=pHead2;
        while (second!=null){
            list2.add(second.val);
            second= second.next;
        }
        list1.retainAll(list2);
        if(list1.size()==0)
            return null;

        Integer integer = list1.get(0);
        first=pHead1;
        while (first!=null){
            if(first.val==integer)
                return first;
            first=first.next;
        }
        return null;
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
