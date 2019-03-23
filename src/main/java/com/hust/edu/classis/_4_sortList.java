package com.hust.edu.classis;

/**
 * locate com.hust.edu.classis
 * Created by mastertj on 2019/3/22.
 使用常量空间复杂度在O（n log n）时间内对链表进行排序。
 所以对应此题目，可以划分为三个小问题：
 1）找到链表中点 （快慢指针思路，快指针一次走两步，慢指针一次走一步，快指针在链表末尾时，慢指针恰好在链表中点）；
 2）写出merge函数，即如何合并链表。 （见merge-two-sorted-lists 一题解析）
 3）写出mergesort函数，实现上述步骤。
 */
public class _4_sortList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode middle = findMiddle(head);
        //System.out.println(middle.val);
        ListNode right = sortList(middle.next);
        middle.next=null;
        ListNode left = sortList(head);
        return mergetList(left,right);
    }

    private ListNode findMiddle(ListNode head){
        ListNode first=head;
        ListNode second=head;
        while (second.next!=null && second.next.next!=null){
            first=first.next;
            second=second.next.next;
        }
        return first;
    }

        public ListNode mergetList(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;

        ListNode dumpyNode=new ListNode(-1);
        ListNode temp=dumpyNode;
        while (list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=new ListNode(list1.val);
                list1=list1.next;
            }else {
                temp.next = new ListNode(list2.val);
                list2=list2.next;
            }
            temp=temp.next;
        }

        while (list1!=null){
            temp.next=new ListNode(list1.val);
            temp=temp.next;
            list1=list1.next;
        }

        while (list2!=null){
            temp.next=new ListNode(list2.val);
            temp=temp.next;
            list2=list2.next;
        }

        return dumpyNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        _4_sortList sortList=new _4_sortList();
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(4);
        sortList.sortList(head);
    }
}
