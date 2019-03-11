package com.hust.edu._pdd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * locate com.hust.edu._pdd
 * Created by MasterTj on 2019/3/10.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            int N= in.nextInt();
            int d= in .nextInt();
            Bank[] banks=new Bank[N];

            for (int i = 0; i < N; i++) {
                banks[i]=new Bank(in.nextInt(),in.nextInt());
            }

            Arrays.sort(banks, new Comparator<Bank>() {
                @Override
                public int compare(Bank o1, Bank o2) {
                    return -(o1.value-o2.value);
                }
            });

            int max=Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = i+1; j < N; j++) {
                    if(Math.abs(banks[i].position-banks[j].position)>=d){
                        max=Math.max(banks[i].value+banks[j].value,max);
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static class Bank{
        private int position;
        private int value;

        public Bank() {
        }

        public Bank(int position, int value) {
            this.position = position;
            this.value = value;
        }
    }
}
