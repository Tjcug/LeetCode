package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by mastertj on 2019/3/24.
 * 解题思路：每位都在(2, 5, 6, 9, 0, 1, 8)内，至少一位在(2, 5, 6, 9)内
 */
public class _788_rotatedDigits {
    public static int rotatedDigits(int N) {
        int count=0;
        for (int i = 2; i <=N ; i++) {
            String str=String.valueOf(i);
            str=str.replaceAll("[+0,+1,+8]","");
            if(!str.equals("")){
                str=str.replaceAll("[+2,+5,+6,+9]","");
                if(str.equals(""))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = _788_rotatedDigits.rotatedDigits(10);
        System.out.println(i);
    }
}
