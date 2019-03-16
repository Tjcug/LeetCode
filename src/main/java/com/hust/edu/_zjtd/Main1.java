package com.hust.edu._zjtd;

/**
 * locate com.hust.edu._zjtd
 * Created by MasterTj on 2019/3/16.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            int price = in.nextInt();
            System.out.println(lessCoin(price));
        }
    }

    public static int lessCoin(int price){
        int[] array = new int[1024-price+1];
        int i =1,cost;
        array[0]=0;
        while(i<array.length){
            cost = 1000000000;
            if(i-1>=0) cost = Math.min(cost,array[i-1]+1);
            if(i-4>=0) cost = Math.min(cost,array[i-4]+1);
            if(i-16>=0) cost = Math.min(cost,array[i-16]+1);
            if(i-64>=0) cost = Math.min(cost,array[i-64]+1);
            array[i]=cost;
            i++;
        }

        return array[array.length-1];
    }
}
