package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/23.
 * 字符串报数字：报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 */
public class _38_countAndSay {
    public static String countAndSay(int n) {
        if(n==1)
            return "1";

        String str="1";
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i < n; i++) {
            int count=1;
            char temp=str.charAt(0);
            for (int j = 1; j < str.length(); j++) {
                if(str.charAt(j)==temp){
                    count++;
                }else {
                    sb.append(count).append(temp);
                    temp=str.charAt(j);
                    count=1;
                }
            }
            sb.append(count).append(temp);
            str=sb.toString();
            sb.setLength(0);
        }
        return str;
    }

    public static void main(String[] args) {
        String s = countAndSay(4);
        System.out.println(s);
    }
}
