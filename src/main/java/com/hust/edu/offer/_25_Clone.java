package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/6.
 * 复杂链表的复制操作
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head
 */
public class _25_Clone {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null)
            return null;
        RandomListNode temp=pHead;

        //分解原始链表，假设原始链表为A-B-C 分解之后为A-A1-B-B1-C-C1
        while (temp!=null){
            RandomListNode random=new RandomListNode(temp.label);
            random.next=temp.next;
            temp.next=random;
            temp=random.next;
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
        RandomListNode cloneHead=pHead.next;
        temp=pHead;
        RandomListNode cloneTemp=cloneHead;
        while (temp!=null){
            temp.next = temp.next.next;
            if(cloneTemp.next!=null)
                cloneTemp.next=cloneTemp.next.next;
            temp=temp.next;
            cloneTemp=cloneTemp.next;
        }
        return cloneHead;
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
