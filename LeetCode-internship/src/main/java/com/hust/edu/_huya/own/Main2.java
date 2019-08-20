package com.hust.edu._huya.own;

import java.util.*;

/**
 * locate com.hust.edu._huya.own
 * Created by mastertj on 2019/5/8.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n=in.nextInt();
            int k=in.nextInt()-1;
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append("|");
            }
            for (int i = 0; i < n; i++) {
                sb.append("*");
            }
            ArrayList<String> permutation = Permutation(sb.toString());
            System.out.println(permutation.size());
            for (int i = 0; i < permutation.size(); i++) {
                System.out.println(permutation.get(i));
            }
        }
    }

    private static ArrayList<String> list=new ArrayList<>();

    public static ArrayList<String> Permutation(String str) {
        if(str.length()==0)
            return list;
        PermutationHelper(str.toCharArray(),0);
        Collections.sort(list);
        return list;
    }

    private static void PermutationHelper(char[] chars, int index){
        if(index==chars.length){
            list.add(String.valueOf(chars));
        }
        for (int i = index; i < chars.length; i++) {
            if(isSwap(chars,index,i)){
                swap(chars,index,i);
                PermutationHelper(chars,index+1);
                swap(chars,i,index);
            }
        }
    }

    //判断low到high之间是否有和low[high]元素相同的元素
    private static boolean isSwap(char[] chars, int low ,int high){
        for (int i = low; i <high; i++) {
            if (chars[i] == chars[high])
                return false;
        }
        return true;
    }

    private static void swap(char[] chars, int i, int k) {
        char temp=chars[k];
        chars[k]=chars[i];
        chars[i]=temp;
    }

}
