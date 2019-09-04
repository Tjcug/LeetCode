package com.hust.edu._renren;

/**
 * locate com.hust.edu._renren
 * Created by MasterTj on 2019/9/3.
 */
public class Test extends Thread{

    public void test(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.run();
    }
}
