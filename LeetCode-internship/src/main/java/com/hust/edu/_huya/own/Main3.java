package com.hust.edu._huya.own;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * locate com.hust.edu._huya.own
 * Created by mastertj on 2019/5/8.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            ArrayList<String> beforeList=new ArrayList<>();
            ArrayList<String> afterList=new ArrayList<>();
            for (int j = 0; j < N; j++) {
                beforeList.add(in.next());
            }
            for (int j = 0; j < N; j++) {
                afterList.add(in.next());
            }
            int result=0;
            for (int i = 0; i < N; i++) {
                result+=compareCharacter(beforeList.get(i),afterList.get(i));
            }
            System.out.println(result);
        }
    }

    public static int compareCharacter(String before,String after){
        int dp[][];
        int sLen=before.length();
        int tLen=after.length();
        int si,ti;
        char ch1,ch2;
        int cost;
        if(sLen==0){
            return tLen;
        }
        if(tLen==0)
            return sLen;
        dp=new int[sLen+1][tLen+1];
        for (si = 0; si <=sLen ; si++) {
            dp[si][0]=si;
        }
        for (ti= 0; ti <= tLen ; ti++) {
            dp[0][ti]=ti;
        }

        for (si=1; si<=sLen ; si++) {
            ch1= before.charAt(si-1);
            for (ti= 1; ti <=tLen ; ti++) {
                ch2=after.charAt(ti-1);
                if(ch1==ch2)
                    cost=0;
                else cost=1;
                dp[si][ti]=Math.min(Math.min(dp[si-1][ti]+1,dp[si][ti-1]+1),dp[si-1][ti-1]+cost);
            }
        }
        return dp[sLen][tLen];
    }
}
