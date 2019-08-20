package com.hust.edu.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * locate com.hust.edu.stack
 * Created by mastertj on 2019/3/6.
 */
public class Main{
    public List<String> getSplit(String str){
        List<String> resultList=new ArrayList<String>();
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        int temp=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='\'') {
                if (stack1.isEmpty()) {
                    stack1.push('\'');
                } else
                    stack1.pop();
            }

            if(str.charAt(i)=='"'){
                if(stack2.isEmpty()){
                    stack2.push('\'');
                }
                else
                    stack2.pop();
            }

            if(str.charAt(i)==' ' && stack1.isEmpty() && stack2.isEmpty()){
                resultList.add(str.substring(temp,i));
                temp=i+1;
            }
        }

        resultList.add(str.substring(temp,str.length()));
        return resultList;
    }

    public static void main(String[] args) {
        Main main=new Main();
        List<String> split = main.getSplit("ab 'deaf a'd");
        System.out.println(split);
    }
}
