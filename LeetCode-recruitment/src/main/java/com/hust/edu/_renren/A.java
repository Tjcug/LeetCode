package com.hust.edu._renren;

/**
 * locate com.hust.edu._renren
 * Created by MasterTj on 2019/9/3.
 */
public class A {
    static class Inner{
        public void method(){
            System.out.println("method");
        }
    }

    static class Inner2{
        public static void method(){
            System.out.println("print");
        }
    }

    public static void main(String[] args) {
        A.Inner a= new A.Inner();
        a.method();
        A.Inner2.method();
    }
}
