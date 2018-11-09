package com.hust.edu.stack;

import java.util.Stack;

/**
 * locate com.hust.edu.stack
 * Created by MasterTj on 2018/11/9.
 * LetCode 20 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 */
public class _20_isValid {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        if(s.equals(""))
            return true;

        for(char ch : s.toCharArray()){
            if(ch== '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            if(ch== ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                switch (ch) {
                    case ')':
                        if (top != '(')
                            return false;
                        break;
                    case '}':
                        if (top != '{')
                            return false;
                        break;
                    case ']':
                        if (top != '[')
                            return false;
                        break;
                }
            }
        }

        if(!stack.isEmpty())
            return false;
        return true;
    }
}
