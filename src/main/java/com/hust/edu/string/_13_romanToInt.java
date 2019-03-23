package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2019/3/23.
 */
public class _13_romanToInt {
    public int romanToInt(String s) {
        int index=0;
        int result=0;
        while (index<s.length()){
            //判断s.charAt(index)是否是I
            if(s.charAt(index)=='I'){
                if(index+1<s.length() && s.charAt(index+1)=='V'){
                    result+=4;
                    index+=2;
                }else if(index+1<s.length() && s.charAt(index+1)=='X') {
                    result += 9;
                    index+=2;
                }else {
                    result+=1;
                    index++;
                }
                continue;
            }

            //判断s.charAt(index)是否是X
            if(s.charAt(index)=='X'){
                if(index+1<s.length() && s.charAt(index+1)=='L'){
                    result+=40;
                    index+=2;
                }else if(index+1<s.length() && s.charAt(index+1)=='C') {
                    result += 90;
                    index+=2;
                }else {
                    result+=10;
                    index++;
                }
                continue;
            }

            //判断s.charAt(index)是否是X
            if(s.charAt(index)=='C'){
                if(index+1<s.length() && s.charAt(index+1)=='D'){
                    result+=400;
                    index+=2;
                }else if(index+1<s.length() && s.charAt(index+1)=='M') {
                    result += 900;
                    index+=2;
                }else {
                    result+=100;
                    index++;
                }
                continue;
            }

            if(s.charAt(index)=='V'){
                result+=5;
                index++;
                continue;
            }

            if(s.charAt(index)=='L'){
                result+=50;
                index++;
                continue;
            }

            if(s.charAt(index)=='D'){
                result+=500;
                index++;
                continue;
            }

            if(s.charAt(index)=='M'){
                result+=1000;
                index++;
                continue;
            }
        }
        return result;
    }
}
