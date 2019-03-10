package com.hust.edu._pdd;

import java.util.HashMap;
import java.util.Scanner;

/**
 * locate com.hust.edu._pdd
 * Created by MasterTj on 2019/3/10.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            HashMap<Character,Integer> map=new HashMap<>();
            String str = in.nextLine();
            String lowerCase = str.toLowerCase();
            char[] chars = lowerCase.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(map.get(chars[i])==null)
                    map.put(chars[i],1);
                else {
                    Integer integer = map.get(chars[i]);
                    map.put(chars[i],++integer);
                }
            }

            int index = 0;
            for (int i = 1; i < chars.length; i++) {
                if((int)chars[index] > (int)chars[i]){
                    int temp=i-1;
                    while (temp>index){
                        Integer integer = map.get(chars[temp]);
                        if(integer>1){
                            temp--;
                            map.put(chars[temp],--integer);
                        }else
                            break;
                    }
                    if(temp==index)
                        index=i;
                }
            }

            System.out.println(chars[index]);
        }
    }
}
