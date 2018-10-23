package com.hust.edu.list;

/**
 * locate com.hust.edu.list
 * Created by mastertj on 2018/10/23.
 * 2 两数相加问题
 */
public class _2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumpNode=new ListNode(0);
        ListNode p=l1,q=l2,curr=dumpNode;

        int carry=0;
        while (p!=null || q!=null){
            int x= (p==null) ? 0: p.val;
            int y= (q==null) ? 0: q.val;
            int sum= x + y + carry;
            int res=sum%10;
            carry=sum/10;
            curr.next=new ListNode(res);
            curr=curr.next;
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dumpNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
