package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 * 从尾部到头部打印链表
 * 两种方法：一种是利用辅助栈实现，一种是利用递归实现
 */
public class _3_printListFromTailToHead {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        Stack<Integer> stack = new Stack <>();
//        ArrayList <Integer> list = new ArrayList <>();
//        while (listNode != null) {
//            stack.push( listNode.val );         //push方法进栈
//            listNode = listNode.next;
//        }
//        while (!stack.empty()) {                //empty()方法判断非空
//            list.add( stack.pop() );            //pop（）方法取出栈顶元素并加入新链表中
//        }
//        return list;
//    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list=new ArrayList<>();
        printListFromTailToHeadHelper(list,listNode);
        return list;
    }

    public void printListFromTailToHeadHelper(ArrayList<Integer> list,ListNode listNode){
        if (listNode != null) {
            printListFromTailToHeadHelper(list,listNode.next);
            list.add(listNode.val);
        }
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
