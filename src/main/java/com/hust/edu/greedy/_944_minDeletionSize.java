package com.hust.edu.greedy;

/**
 * locate com.hust.edu.greedy
 * Created by MasterTj on 2019/4/5.
 * LetCode 944 删列造序
 * 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
 * 选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。 所余下的字符串行从上往下读形成列。
 */
public class _944_minDeletionSize {
    public int minDeletionSize(String[] A) {
        int length = A[0].length();
        int count=0;
        for (int i = 0; i < length; i++) {
            boolean m_bool=true;
            for (int j = 1; j < A.length; j++) {
                if(A[j].charAt(i)<A[j-1].charAt(i)){
                    m_bool=false;
                    break;
                }
            }
            if(m_bool)
                count++;
        }
        return length-count;
    }
}
