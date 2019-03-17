package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/1.
 * 合并两个链表
 */
public class _16_Merge {
    //模拟归并排序方式
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        if(list1==null)
//            return list2;
//        else if(list2==null)
//            return list1;
//
//        ListNode dumpyNode=new ListNode(-1);
//        ListNode temp=dumpyNode;
//        while (list1!=null && list2!=null){
//            if(list1.val<=list2.val){
//                temp.next=new ListNode(list1.val);
//                list1=list1.next;
//            }else {
//                temp.next = new ListNode(list2.val);
//                list2=list2.next;
//            }
//            temp=temp.next;
//        }
//
//        while (list1!=null){
//            temp.next=new ListNode(list1.val);
//            temp=temp.next;
//            list1=list1.next;
//        }
//
//        while (list2!=null){
//            temp.next=new ListNode(list2.val);
//            temp=temp.next;
//            list2=list2.next;
//        }
//
//        return dumpyNode.next;
//    }

    //递归方式求解
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;

        ListNode dumpyNode=new ListNode(-1);
        if(list1.val<list2.val){
            dumpyNode.next=list1;
            list1.next=Merge(list1.next,list2);
        }else {
            dumpyNode.next=list2;
            list2.next=Merge(list1,list2.next);
        }
        return dumpyNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
