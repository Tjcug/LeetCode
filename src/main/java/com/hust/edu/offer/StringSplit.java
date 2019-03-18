package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/18.
 */
public class StringSplit{
    public static ArrayList<String> getSplit(String str){
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        ArrayList<String> result=new ArrayList();
        int index=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='#'){
                if(!stack1.isEmpty())
                    stack1.pop();
                else stack1.push('#');
            }else if(str.charAt(i)=='!'){
                if(!stack2.isEmpty())
                    stack2.pop();
                else stack2.push('!');
            }

            if(stack1.isEmpty() && stack2.isEmpty()){
                if(str.charAt(i)==' '){
                    result.add(str.substring(index,i));
                    index=i+1;
                }
            }
        }
        result.add(str.substring(index,str.length()));
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> abc_def = getSplit("abc # def ddd ! dsfdsf !#");
        System.out.println(abc_def);
    }
}
