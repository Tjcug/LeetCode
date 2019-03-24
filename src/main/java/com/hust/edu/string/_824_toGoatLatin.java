package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by mastertj on 2019/3/24.
 * 824. 山羊拉丁文
 * 给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
 * 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
 例如，单词"apple"变为"applema"。

 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 例如，单词"goat"变为"oatgma"。

 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
 */
public class _824_toGoatLatin {
    public String toGoatLatin(String S) {
        String[] split = S.split(" ");
        String[] strings=new String[split.length];
        StringBuilder result=new StringBuilder();
        for (int i = 0; i <split.length ; i++) {
            String str = split[i];
            StringBuilder sb=new StringBuilder();
            if(isVowel(str.charAt(0))){
                sb.append(str).append("ma");
            }else {
                sb.append(str.substring(1,str.length())).append(str.charAt(0)).append("ma");
            }
            int index=i;
            while (index>=0){
                sb.append("a");
                index--;
            }
            strings[i]=sb.toString();
        }
        for(int i=0;i<strings.length;i++){
            result.append(strings[i]);
            if(i<strings.length-1)
                result.append(" ");
        }
        return result.toString();
    }

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch=='e' || ch =='i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
