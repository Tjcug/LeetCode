package com.hust.edu._douyu;

/**
 * locate com.hust.edu._douyu
 * Created by MasterTj on 2019/8/20.
 */
public class Main1 {
    public static void main(String[] args) {
        String s1=new String("good");
        String s2= new String("bad");
        exchangeStringA(s1,s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        StringBuilder sb1=new StringBuilder("good");
        StringBuilder sb2=new StringBuilder("bad");
        exchangeStringB(sb1,sb2);
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
    }

    public static void exchangeStringA(String s1,String s2){
        s1=s2;
        s2=new String();
        s1+="world";
        s2+="world";
    }

    public static void exchangeStringB(StringBuilder s1,StringBuilder s2){
        s1=s2;
        s2=new StringBuilder();
        s1.append("world");
        s2.append("world");
    }
}
