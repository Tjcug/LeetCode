package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 * 旋转数组中的最小数字，考察二分搜索算法。
 */
public class _6_minNumberInRotateArray {
    public static int minNumberInRotateArray(int [] array) {
        int low=0;
        int high=array.length-1;
        int result=-1;
        while (array[low]>=array[high]){
            if(high-low==1) {
                result=high;
                break;
            }
            int mid=(low+high)/2;
            if(array[mid]>=array[low]){
                //mid在递增序列中
                low=mid;
            }else if(array[mid]<=array[high]){
                //mid在递减序列中
                high=mid;
            }

        }
        return array[result];
    }

    public static void main(String[] args) {
        int i = _6_minNumberInRotateArray.minNumberInRotateArray(new int[]{3, 4, 5, 1, 2});
        System.out.println(i);
    }
}
