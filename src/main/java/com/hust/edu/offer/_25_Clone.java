package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/6.
 */
public class _25_Clone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
            return null;
        RandomListNode temp=pHead;

        //分解原始链表，假设原始链表为A-B-C 分解之后为A-A1-B-B1-C-C1
        while (temp!=null){
            RandomListNode randomListNode=new RandomListNode(temp.label);
            randomListNode.next=temp.next;
            temp.next=randomListNode;
            temp=randomListNode.next;
        }

        //复制random pCur是原来链表的结点 pCur.next是复制pCur的结点
        temp=pHead;
        while (temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }

        //拆分 拆分整个链表的偶数位置就是最后的值
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        temp = pHead;
        //拆分链表
        while(temp!=null){
            temp.next = temp.next.next;
            if(cur.next!=null)
                cur.next = cur.next.next;

            cur = cur.next;
            temp = temp.next;
        }
        return head;
    }

    private class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
}
