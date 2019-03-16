package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 * 举证覆盖问题
 */
public class _10_RectCover {
    public int RectCover(int target) {
        if(target<=0)
            return 0;
        if(target==1 || target==2)
            return target;
        return (RectCover(target-1)+RectCover(target-2));
    }
}
