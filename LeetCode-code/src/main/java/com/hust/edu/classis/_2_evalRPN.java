package com.hust.edu.classis;

import java.util.Stack;

/**
 * locate com.hust.edu.classis
 * Created by mastertj on 2019/3/20.
 * 在反向波兰表示法中计算算术表达式的值。
 *
 * 有效的运算符是+， - ，*，/。 每个操作数可以是整数或另一个表达式。
 */
public class _2_evalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            Integer n1,n2;
            switch (token){
                case "+":
                    n1 = Integer.valueOf(stack.pop());
                    n2 = Integer.valueOf(stack.pop());
                    stack.push(n1+n2);
                    break;
                case "-":
                    n1 = Integer.valueOf(stack.pop());
                    n2 = Integer.valueOf(stack.pop());
                    stack.push(n2-n1);
                    break;
                case "*":
                    n1 = Integer.valueOf(stack.pop());
                    n2 = Integer.valueOf(stack.pop());
                    stack.push(n1*n2);
                    break;
                case "/":
                    n1 = Integer.valueOf(stack.pop());
                    n2 = Integer.valueOf(stack.pop());
                    stack.push(n2/n1);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
                    break;
            }
        }
        return stack.pop();
    }
}
