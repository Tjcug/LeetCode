package com.hust.edu.array;

/**
 * locate com.hust.edu.array
 * Created by MasterTj on 2018/12/6.
 * LetCode 45 跳跃游戏2
 */
public class _45_jump {
    public int jump(int[] nums) {
        int ret = 0;
        int curMax = 0;
        int curRch = 0;
        for(int i = 0; i < nums.length; i ++)
        {
            if(curRch < i)
            {
                ret ++;
                curRch = curMax;
            }
            curMax = Math.max(curMax, nums[i]+i);
        }
        return ret;
    }
}
