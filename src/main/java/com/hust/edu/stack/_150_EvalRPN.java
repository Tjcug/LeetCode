package com.hust.edu.stack;

import java.util.Stack;

/**
 * locate com.hust.edu.stack
 * Created by mastertj on 2018/10/22.
 * 150. 逆波兰表达式求值
 */
public class _150_EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i< tokens.length;i++){
            String token = tokens[i];
            switch (token) {
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    Integer n1=stack.pop();
                    Integer n2=stack.pop();
                    stack.push(n2-n1);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    Integer num1=stack.pop();
                    Integer num2=stack.pop();
                    stack.push(num2/num1);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
                    break;
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {

    }
}
