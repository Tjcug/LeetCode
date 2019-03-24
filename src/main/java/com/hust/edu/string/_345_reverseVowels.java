package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 */
public class _345_reverseVowels {
    public String reverseVowels(String s) {
        StringBuilder res=new StringBuilder();
        StringBuilder voewl=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)){
                voewl.append(ch);
            }
        }
        String voewlStr = voewl.reverse().toString();
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)){
                res.append(voewlStr.charAt(index));
                index++;
            }else
                res.append(ch);
        }
        return res.toString();
    }

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch=='e' || ch =='i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
