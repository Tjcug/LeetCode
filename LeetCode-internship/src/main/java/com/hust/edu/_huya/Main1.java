package com.hust.edu._huya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/4/10.
 */
public class Main1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int count = 0;
            count = in.nextInt();
            String[] strList = new String[count];

            //save the input
            for (int i = 0; i < count; i++) {
                strList[i] = in.next();
                //System.out.println(strList[i]);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            for (int i = 0; i < count; i++) {
                String[] str = splitToEight(strList[i].toString());
                for (int j = 0; j < str.length; j++) {
                    arrayList.add(str[j]);
                }
            }
            //System.out.println(arrayList);

            String[] resultStr = arrayList.toArray(new String[arrayList.size()]);

            Arrays.sort(resultStr);

            for(int i=0;i<resultStr.length-1;i++){

                System.out.print(resultStr[i] + " ");;

            }

            System.out.print(resultStr[resultStr.length-1].toString());

        }
    }

    private static String[] splitToEight(String string) {
        // TODO Auto-generated method stub
        int splitCnt;
        if ((string.length() % 8) == 0) {
            splitCnt = string.length() / 8;
        } else {
            splitCnt = string.length() / 8 + 1;
        }
        System.out.println(splitCnt);
        String[] returnStr = new String[splitCnt];

        for (int i = 0; i < splitCnt - 1; i++) {
            returnStr[i] = string.substring(8 * i, 8 * i + 8);
            System.out.println(returnStr[i]);
        }

        returnStr[splitCnt - 1] = completeZero(string.substring(8 * splitCnt - 8));
        return returnStr;
    }

    private static String completeZero(String substring) {
        // TODO Auto-generated method stub
        char[] a = new char[8];
        int length = substring.length();
        for (int i = 0; i < length; i++) {
            a[i] = substring.charAt(i);
        }
        if (length < 8) {
            for (int i = length; i < 8; i++) {
                a[i] = '0';
            }
        }
        return String.valueOf(a);
    }
}
