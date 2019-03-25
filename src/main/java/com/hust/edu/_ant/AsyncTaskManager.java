package com.hust.edu._ant;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * locate com.hust.edu._ant
 * Created by MasterTj on 2019/3/25.
 */
public class AsyncTaskManager {
    private PriorityQueue<Task> priorityQueue=new PriorityQueue<>();
    private Queue<Task> fifoQueue=new ArrayDeque<>();

    private void addTask(Task task){
        priorityQueue.add(task);
        fifoQueue.add(task);
    }

    private Task getTask(boolean isPriority){
        if(isPriority){
            Task poll = priorityQueue.poll();
            fifoQueue.remove(poll);
            return poll;
        }else {
            Task poll = fifoQueue.poll();
            priorityQueue.remove(poll);
            return poll;
        }
    }

    private static class Task implements Comparable<Task>{
        //默认优先级，高优先级队列先运行
        private int priority=1;
        private Runnable runnable;

        public Task(int priority, Runnable runnable) {
            this.priority = priority;
            this.runnable = runnable;
        }

        public Task(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override
        public int compareTo(Task o) {
            return -(this.priority-o.priority);
        }

        @Override
        public String toString() {
            return "Task{" +
                    "priority=" + priority +
                    ", runnable=" + runnable +
                    '}';
        }
    }

    public static void main(String[] args) {
        AsyncTaskManager asyncTaskManager=new AsyncTaskManager();

        asyncTaskManager.addTask(new Task(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("3");
            }
        }));

        asyncTaskManager.addTask(new Task(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("5");
            }
        }));

        asyncTaskManager.addTask(new Task(1, new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        }));

        System.out.println(asyncTaskManager.getTask(true));
        System.out.println(asyncTaskManager.getTask(false));
    }
}
