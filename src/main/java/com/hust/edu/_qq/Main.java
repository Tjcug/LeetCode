package com.hust.edu._qq;

/**
 * locate com.hust.edu._qq
 * Created by mastertj on 2019/3/23.
 */
public class Main {
        public static void main(String[] args) {
            String[] strs={"abcde","abc","ab","ae"};
            System.out.println(getMaxStr(strs));
        }

        public static String getMaxStr(String[] strs){
            StringBuilder sb=new StringBuilder();
            int index=0;
            String str="";
            while((str=getMaxStrHelper(strs,index))!=""){
                index++;
                sb.append(str);
            }
            return sb.toString();
        }

        public static String getMaxStrHelper(String[] strs,int index){
            char temp=strs[0].charAt(index);
            for(int i=0;i<strs.length;i++){
                if(index<strs[i].length() && strs[i].charAt(index)==temp){
                    continue;
                }else
                    return "";
            }
            return String.valueOf(temp);
        }
}
