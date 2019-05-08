package com.hust.edu._huya;

import java.util.Scanner;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/4/29.
 */
public class    Soda {
    public static int findMaxSodaNum(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        int top=n/3;
        int num=n%3;
        return top+findMaxSodaNum(num+top);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()) {//不能用true
            int countOriginal = in.nextInt();
            if (countOriginal == 0) {
                break;
            }

            System.out.println(findMaxSodaNum(countOriginal));
        }
    }
}
