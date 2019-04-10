package com.hust.edu._huya;

import java.util.Scanner;
import java.util.Stack;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/4/10.
 */
public class Main2 {

    private static String getLAMXString(String str,int top){
        int index=0;
        StringBuilder sb=new StringBuilder();
        while (index<str.length()) {
            char ch = str.charAt(index);
            Stack<Character> stack = new Stack<>();
            if (ch >= '0' && ch <= '9') {
                int nexTtop = ch - '0';
                char temp = '0';
                char bracketed = str.charAt(index + 1);
                switch (bracketed) {
                    case '(':
                        temp = ')';
                        break;
                    case '[':
                        temp = ']';
                        break;
                    case '{':
                        temp = '}';
                        break;
                }
                stack.push(temp);
                int findIndex = index + 2;
                while (!stack.isEmpty()) {
                    if (str.charAt(findIndex) == bracketed)
                        stack.push(temp);
                    else if (str.charAt(findIndex) == temp)
                        stack.pop();
                    findIndex++;
                }
                String lamxString = getLAMXString(str.substring(index + 2, findIndex - 1), nexTtop);
                sb.append(lamxString);
                index=findIndex-1;
            }else {
                sb.append(str.charAt(index));
            }
            index++;
        }
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < top; i++) {
            result.append(sb.toString());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String next = in.next();
            StringBuilder sb=new StringBuilder();
            String lamxString = getLAMXString(next, 1);
            sb.append(lamxString);
            System.out.println(sb.reverse().toString());
        }
    }
}
