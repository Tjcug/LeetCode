package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 686. 重复叠加字符串匹配
 * 给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。
 */
public class _686_repeatedStringMatch {
    public static int repeatedStringMatch(String A, String B) {
        int size1 = A.length();
        int size2 = B.length();

        String C="";
        for (int i = 0; i < size2 / size1 + 2; i++) {
            C+=A;
            if(isSubString(C,B))
                return i+1;
        }
        return -1;
    }

    /**
     * 判断target是否是parent的子串
     * @param parent
     * @param target
     * @return
     */
    private static boolean isSubString(String parent,String target){
        int index=parent.indexOf(target);
        if(index>=0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int i = _686_repeatedStringMatch.repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab", "ba");
        System.out.println(i);
    }
}
