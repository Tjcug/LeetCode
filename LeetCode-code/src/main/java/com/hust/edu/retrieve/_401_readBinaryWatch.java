package com.hust.edu.retrieve;

import java.util.LinkedList;
import java.util.List;

/**
 * locate com.hust.edu.retrieve
 * Created by MasterTj on 2019/4/5.
 * LetCode 401 二进制手表
 *
 */
public class _401_readBinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new LinkedList<>();
        //直接遍历  0:00 -> 12:00   每个时间有多少1
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (count1(i) + count1(j) == num)
                    res.add(i + ":" + (j < 10 ? "0" + j : j));
            }
        }
        return res;
    }

    /**
     * 计算二进制中1的个数
     * @param n
     * @return
     */
    int count1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
