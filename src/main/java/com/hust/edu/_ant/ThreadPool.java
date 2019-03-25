package com.hust.edu._ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * locate com.hust.edu._ant
 * Created by MasterTj on 2019/3/25.
 */
public class ThreadPool {
    private final Queue<Runnable> taskQueue=new LinkedList<>();
    private ArrayList<WorkerThread> workerThreads=new ArrayList<>();
    private int coreSize=0;

    public ThreadPool(int coreSize) {
        this.coreSize = coreSize;
        //预热
        for (int i = 0; i < coreSize; i++) {
            WorkerThread worker = new WorkerThread();
            workerThreads.add(worker);
            worker.start();
        }
    }

    public void executeTask(Runnable runnable){
        synchronized (taskQueue) {
            taskQueue.add(runnable);
            taskQueue.notifyAll();
        }
    }

    public void destoryTreadPool(){
        synchronized (taskQueue) {
            while (!taskQueue.isEmpty()) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        for(WorkerThread workerThread:workerThreads){
            workerThread.destoryThread();
            workerThread=null;
        }
    }

    private class WorkerThread extends Thread{
        //用来表示当前线程池是否正在运行 用来销毁线程池
        private boolean isRunning=true;

        @Override
        public void run() {
            Runnable runnable=null;
            while (isRunning) {
                synchronized (taskQueue) {
                    while (isRunning && taskQueue.isEmpty()) {
                        try {
                            taskQueue.wait(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //任务队列不为空
                    if (!taskQueue.isEmpty()) {
                        runnable = taskQueue.poll();//获取第一个任务
                    }
                }
                if (runnable != null)
                    runnable.run();

                runnable = null;
            }
        }

        public void destoryThread(){
            isRunning=false;
        }
    }

    public static void main(String[] args) {
        ThreadPool threadPool=new ThreadPool(10);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            threadPool.executeTask(new Runnable() {
                @Override
                public void run() {
                    System.out.println("hhhh "+ finalI);
                }
            });
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPool.destoryTreadPool();
    }
}
