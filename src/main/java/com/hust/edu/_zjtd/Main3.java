package com.hust.edu._zjtd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * locate com.hust.edu._zjtd
 * Created by MasterTj on 2019/3/16.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int N=in.nextInt();
            for (int i = 0; i < N; i++) {
                int n=in.nextInt();
                int[] array=new int[n];
                int[] value=new int[n];
                for (int j = 0; j < n; j++) {
                    array[j]=in.nextInt();
                }
                Arrays.sort(array);
                value[0]=1;
                int result=0;
                for (int j = 0; j < array.length-1; j++) {
                    if(array[j+1]>array[j]){
                        value[j+1]=value[j]+1;
                    }else if(j+1==array.length-1){
                        if(array[j+1]>array[0])
                            value[j+1]=value[0]+1;
                    }
                }
                for (int j = 0; j < value.length; j++) {
                    result+=value[j];
                }
                System.out.println(result);
            }
        }
    }
}
