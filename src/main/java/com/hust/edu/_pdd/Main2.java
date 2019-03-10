package com.hust.edu._pdd;

import java.util.HashMap;
import java.util.Map;
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

            char dfs = dfs(chars, 0, map);
            System.out.println(dfs);
        }
    }

    public static char dfs(char[] ch,int i, Map<Character,Integer> map){
        if(ch[i]=='a')
            return 'a';
        if(i==ch.length-1 || map.get(ch[i])==1)
            return ch[i];

        map.put(ch[i],1);
        char c=dfs(ch,i+1,map);
        if(c<ch[i])
            return c;
        else
            return ch[i];
    }
}
