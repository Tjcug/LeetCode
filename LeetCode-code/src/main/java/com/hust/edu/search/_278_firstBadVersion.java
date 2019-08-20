package com.hust.edu.search;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/4/5.
 * 278. 第一个错误的版本
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 */
public class _278_firstBadVersion {
    public int firstBadVersion(int n) {
        if(n==1)
            return 1;
        long low=1;
        long high=n;
        while (low<high){
            long mid=(low+high)/2;
            //中间值是错误版本 往左区间查找尝试发现更早的错误版本
            if(isBadVersion((int)mid))
                high=mid;
            else
                low=mid+1;
        }
        return (int)high;
    }

    private boolean isBadVersion(int version){
        return true;
    }
}
