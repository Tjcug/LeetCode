package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _49_StrToInt {
    public int StrToInt(String str) {
        if(str==null || str.length()==0)
            return 0;
        boolean minus=true;//判断是否是正数
        int index=0;
        int number=0;

        if(str.charAt(index)=='+') {
            index++;
            minus = true;
        }
        else if(str.charAt(index)=='-') {
            index++;
            minus = false;
        }

        for (int i = index; i < str.length(); i++) {
            if('0'<=str.charAt(i) && str.charAt(i)<='9') {
                number = number * 10 + str.charAt(i) - '0';
            }else {
                number=0;
                break;
            }
        }
        if(minus) {
            return number;
        }else return 0-number;
    }
}
