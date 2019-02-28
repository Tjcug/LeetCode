package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 */
public class _9_JumpFloorII {
    public int JumpFloorII(int target) {
        if(target==1)
            return 1;
        return 2*JumpFloorII(target-1);
    }
}
