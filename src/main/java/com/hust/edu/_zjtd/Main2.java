package com.hust.edu._zjtd;

import java.util.Scanner;

/**
 * locate com.hust.edu._zjtd
 * Created by MasterTj on 2019/3/16.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String str1 = containsAAA(str);
            String str2 = containsAABB(str1);
            System.out.println(str2);
        }

    }

    public static String containsAAA(String str){
        StringBuilder sb=new StringBuilder();
        int n1=0,n2=0,n3=0;
        while (n1+2<str.length()){
            n2=n1+1;
            n3=n1+2;
            if(str.charAt(n1)==str.charAt(n2) && str.charAt(n2)==str.charAt(n3)){
                 n1=n2;
                 continue;
            }
            sb.append(str.charAt(n1));
            n1++;
        }
        while (n1<str.length()){
            sb.append(str.charAt(n1));
            n1++;
        }
        return sb.toString();
    }

    public static String containsAABB(String str){
        StringBuilder sb=new StringBuilder();
        int n1=0,n2=0,n3=0,n4=0;
        while (n1+3<str.length()){
            n2=n1+1;
            n3=n1+2;
            n4=n1+3;
            if(str.charAt(n1)==str.charAt(n2) && str.charAt(n3)==str.charAt(n4)){
                sb.append(str.charAt(n1));
                sb.append(str.charAt(n2));
                sb.append(str.charAt(n3));
                n1=n4+1;
                continue;
            }
            sb.append(str.charAt(n1));
            n1++;
        }
        while (n1<str.length()){
            sb.append(str.charAt(n1));
            n1++;
        }
        return sb.toString();
    }
}
