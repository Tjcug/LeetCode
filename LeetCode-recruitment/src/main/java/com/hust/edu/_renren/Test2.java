package com.hust.edu._renren;

/**
 * locate com.hust.edu._renren
 * Created by MasterTj on 2019/9/3.
 */
public class Test2 {
    public void modify(String str, char[] c){
        str="nice";
        c[1]='y';
    }

    public static void main(String[] args) {
        String str= new String("hello");
        char[] c= {'g','o','o','d'};
        Test2 test2=new Test2();
        test2.modify(str,c);
        System.out.println(str+"&");
        System.out.println(c);
    }
}
