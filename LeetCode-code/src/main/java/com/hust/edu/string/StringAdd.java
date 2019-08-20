package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by mastertj on 2019/3/27.
 * 字符串相加问题
 */
public class StringAdd {
    public static String stringAdd(String A,String B){
        StringBuilder sb=new StringBuilder();
        int lengthA = A.length();
        int indexA = A.length()-1;
        int lengthB = B.length();
        int indexB = B.length()-1;
        int top=0;
        while (indexA>=0 || indexB>=0){
            int num1=0,num2=0;
            if(indexA>=0) {
                num1 = A.charAt(indexA)-'0';
                indexA--;
            }
            if(indexB >= 0){
                num2 = B.charAt(indexB)-'0';
                indexB--;
            }
            int res=num1+num2+top;
            int mod=res%10;
            top=res/10;
            sb.append(mod);
        }
        if(top>0)
            sb.append(top);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = StringAdd.stringAdd("1047", "55");
        System.out.println(s);
    }
}
