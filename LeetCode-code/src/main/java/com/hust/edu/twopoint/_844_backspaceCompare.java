package com.hust.edu.twopoint;

import java.util.Stack;

/**
 * locate com.hust.edu.twopoint
 * Created by mastertj on 2019/3/31.
 * LetCode 844 比较退格的字符串
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 */
public class _844_backspaceCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)=='#'){
                if(!stack1.isEmpty())
                    stack1.pop();
            }else {
                stack1.push(S.charAt(i));
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if(T.charAt(i)=='#'){
                if(!stack2.isEmpty())
                    stack2.pop();
            }else {
                stack2.push(T.charAt(i));
            }
        }

        while (!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.pop()!=stack2.pop())
                return false;
        }
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
