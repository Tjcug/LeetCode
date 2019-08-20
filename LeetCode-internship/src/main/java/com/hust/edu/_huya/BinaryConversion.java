package com.hust.edu._huya;

import java.util.Scanner;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/4/29.
 */
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            //Integer.parseInt(x,y)输出y进制数x在十进制下的数
            System.out.println(Integer.parseInt(s.substring(2),16));
            //System.out.println(Integer.valueOf(s.substring(2),16));
        }
    }
}
