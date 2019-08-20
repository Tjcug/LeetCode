package com.hust.edu.string;

import java.util.HashSet;

/**
 * locate com.hust.com.hust.edu.string
 * Created by mastertj on 2019/3/24.
 * 804. 唯一摩尔斯密码词
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串
 */
public class _804_uniqueMorseRepresentations {
    public static int uniqueMorseRepresentations(String[] words) {
        String mores[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String str:words){
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                int index=str.charAt(i)-'a';
                sb.append(mores[index]);
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int i = _804_uniqueMorseRepresentations.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        System.out.println(i);
    }
}
