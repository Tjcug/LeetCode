package com.hust.edu._qq;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * locate com.hust.edu._qq
 * Created by MasterTj on 2019/4/5.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int length=in.nextInt();
            String next = in.next();
            int minLength = findMinLength(next);
            System.out.println(minLength);
        }
    }

    private static int findMinLength(String str){
        Queue<Character> queue=new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            if(queue.isEmpty() || queue.peek()==str.charAt(i)){
                queue.add(str.charAt(i));
            }else if(queue.peek()!=str.charAt(i)){
                queue.poll();
            }
        }
        return queue.size();
    }
}
