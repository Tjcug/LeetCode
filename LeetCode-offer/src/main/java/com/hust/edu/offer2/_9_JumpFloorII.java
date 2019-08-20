package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _9_JumpFloorII {
    public int JumpFloorII(int target) {
        if(target==1)
            return 1;
        return 2*JumpFloorII(target-1);
    }
}
