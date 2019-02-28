package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 */
public class _3_printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack <>();
        ArrayList <Integer> list = new ArrayList <>();
        while (listNode != null) {
            stack.push( listNode.val );         //push方法进栈
            listNode = listNode.next;
        }
        while (!stack.empty()) {                //empty()方法判断非空
            list.add( stack.pop() );            //pop（）方法取出栈顶元素并加入新链表中
        }
        return list;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
