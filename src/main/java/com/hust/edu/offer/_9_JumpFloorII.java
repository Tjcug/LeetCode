package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 * 变态跳台阶问题
 * 可以用递归 也可以用动态规划
 */
public class _9_JumpFloorII {
    public int JumpFloorII(int target) {
        if(target==1)
            return 1;
        return 2*JumpFloorII(target-1);
    }
}
