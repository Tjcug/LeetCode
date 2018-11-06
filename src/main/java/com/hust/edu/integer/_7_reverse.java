package com.hust.edu.integer;

/**
 * locate com.hust.edu.integer
 * Created by MasterTj on 2018/11/6.
 * LetCode 7 给定一个 32 位有符号整数，将整数中的数字进行反转。
 */
public class _7_reverse {
    public int reverse(int x) {
        Integer result = null;
        try {
            StringBuilder sb=new StringBuilder(String.valueOf(Math.abs(x)));
            sb.reverse();
            result = Integer.valueOf(sb.toString());
            ;
            if(x<0){
                result = -result;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
        return result;
    }
}
