package com.hust.edu.offer;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 */
public class _20_MinStack {

    private Queue<Integer> queue=new PriorityQueue<>();
    private LinkedList<Integer> list=new LinkedList<>();

    public void push(int node) {
        queue.add(node);
        list.addFirst(node);
    }

    public void pop() {
        Integer integer = list.removeFirst();
        queue.remove(integer);
    }

    public int top() {
        return list.getFirst();
    }

    public int min() {
        return queue.peek();
    }
}
