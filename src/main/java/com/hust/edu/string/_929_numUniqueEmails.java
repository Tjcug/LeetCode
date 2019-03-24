package com.hust.edu.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * locate com.hust.edu.string
 * Created by mastertj on 2019/3/24.
 * 929. 独特的电子邮件地址
 * 每封电子邮件都由一个本地名称和一个域名组成，以 @ 符号分隔。
 例如，在 alice@leetcode.com中， alice 是本地名称，而 leetcode.com 是域名。
 */
public class _929_numUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        for(int i = 0; i < emails.length; i++){
            String[] es = emails[i].split("@");
            String name = es[0].replace(".","").replaceAll("\\+[a-zA-Z]*[0-9]*","");
            emails[i] = name + "@" + es[1];
        }
        Set set = new HashSet(Arrays.asList(emails));
        return set.size();
    }
}
