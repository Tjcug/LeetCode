package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 * 跳台阶问题
 * 可以有两种解法递归和动态规划
 */
public class _8_JumpFloor {
    public int JumpFloor(int target) {
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
