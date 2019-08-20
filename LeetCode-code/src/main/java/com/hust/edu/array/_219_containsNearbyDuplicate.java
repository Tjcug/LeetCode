package com.hust.edu.array;

import java.util.HashMap;

/**
 * locate com.hust.com.hust.edu.array
 * Created by mastertj on 2018/11/1.
 */
public class _219_containsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
               if((i-hashMap.get(nums[i])<=k))
                   return true;
               else
                   hashMap.put(nums[i],i);
            }
            else
                hashMap.put(nums[i],i);
        }

        return false;
    }
}
