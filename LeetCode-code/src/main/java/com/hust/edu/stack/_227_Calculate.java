package com.hust.edu.stack;

import java.util.Stack;

/**
 * locate com.hust.edu.stack
 * Created by mastertj on 2018/10/22.
 * 简单计算器2
 */
public class _227_Calculate {
    public int calculate(String s) {
        Stack<Character> stack=new Stack<>();
        Stack<Integer> opeartorNums=new Stack<>();
        for(int i=0; i< s.length();i++){
            char ch= s.charAt(i);
            switch (ch) {
                case '+':
                    while (!stack.isEmpty()){
                        calucateHelper(stack, opeartorNums);
                    }
                    stack.push(ch);
                    break;
                case '-':
                    while (!stack.isEmpty()){
                        calucateHelper(stack, opeartorNums);
                    }
                    stack.push(ch);
                    break;
                case '*':
                    while (!stack.isEmpty() && stack.peek() =='*' || stack.peek() == '/'){
                        calucateHelper(stack, opeartorNums);
                    }
                    stack.push(ch);
                    break;
                case '/':
                    while (!stack.isEmpty() && stack.peek() == '*' || stack.peek() == '/'){
                        calucateHelper(stack, opeartorNums);
                    }
                    stack.push(ch);
                    break;
                case ' ':
                    break;
                default:
                    int start=i;
                    while (i<s.length() && Character.isDigit(s.charAt(i))){
                        i++;
                    }
                    opeartorNums.push(Integer.valueOf(s.substring(start,i)));
                    --i;
                    break;
            }
        }
        while (!stack.isEmpty()){
            calucateHelper(stack, opeartorNums);
        }
        return opeartorNums.pop();
    }

    private void calucateHelper(Stack<Character> stack, Stack<Integer> opeartorNums) {
        Character character = stack.pop();
        int result = operatorNums(opeartorNums.pop(), opeartorNums.pop(), character);
        opeartorNums.push(result);
    }

    public int operatorNums(int num1, int num2, Character operator){
        switch (operator){
            case '+':
                return num1+num2;
            case '-':
                return num2-num1;
            case '*':
                return num1*num2;
            case '/':
                return num2/num1;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        _227_Calculate calculate=new _227_Calculate();
        int calculate1 = calculate.calculate("3+2*2-6/5");
        System.out.println(calculate1);
    }
}
