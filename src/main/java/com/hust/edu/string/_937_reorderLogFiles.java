package com.hust.edu.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * locate com.hust.edu.string
 * Created by mastertj on 2019/3/25.
 * 937. 重新排列日志文件
 * 你有一个日志数组 logs。每条日志都是以空格分隔的字串。

 对于每条日志，其第一个字为字母数字标识符。然后，要么：

 标识符后面的每个字将仅由小写字母组成，或；
 标识符后面的每个字将仅由数字组成。
 */
public class _937_reorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int index1 = o1.indexOf(' ');
                String s1 = o1.substring(index1+1);
                int index2 = o2.indexOf(' ');
                String s2 = o2.substring(index2+1);
                char c1 = s1.charAt(0);
                char c2 = s2.charAt(0);
                if ( Character.isLetter(c1) && Character.isLetter(c2)) {
                    return s1.compareTo(s2);
                }else if (Character.isLetter(c1)) {
                    return -1;
                }else if (Character.isLetter(c2)) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        return logs;
    }
}
