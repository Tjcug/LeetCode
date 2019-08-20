package com.hust.edu.list;

/**
 * locate com.hust.com.hust.edu.list
 * Created by mastertj on 2018/10/23.
 * 2 两数相加问题
 */
public class _2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1,p2=l2;
        int top=0;//进位
        ListNode dumpyNode=new ListNode(-1);
        ListNode temp=dumpyNode;
        while (p1!=null || p2!=null){
            int num1=0,num2=0;
            if(p1!=null)
                num1=p1.val;
            if(p2!=null)
                num2=p2.val;
            int result=num1+num2+top;
            top=result/10;
            temp.next=new ListNode(result%10);
            temp=temp.next;
            if(p1!=null)
                p1=p1.next;
            if(p2!=null)
                p2=p2.next;
        }
        if(top>0)
            temp.next=new ListNode(top);
        return dumpyNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
