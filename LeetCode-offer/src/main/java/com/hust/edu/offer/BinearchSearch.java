package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/16.
 */
public class BinearchSearch {
    public static int binearchSearch(int nums[],int target){
        int result=-1;
        //定义low和hgih分别表示数组的起始元素和结束元素
        int low=0;
        int high=nums.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target)
                high=mid-1;
            else {
                result = mid;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int search = BinearchSearch.binearchSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,}, 7);
        System.out.println(search);
    }
}
