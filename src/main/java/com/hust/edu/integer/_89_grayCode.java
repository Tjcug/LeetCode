package com.hust.edu.integer;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.integer
 * Created by MasterTj on 2018/12/7.
 * LetCode 89 格雷编码 格雷编码是一个二进制数字系统，在该系统中，两个连续的数值仅有一个位数的差异。
 */
public class _89_grayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        int cur;
        for (int i = 0; i < n; i++) {
            int change = 1 << i;
            cur = res.size() - 1;
            while(cur >= 0) {
                res.add(res.get(cur) ^ change);
                cur--;
            }
        }
        return res;
    }
}
