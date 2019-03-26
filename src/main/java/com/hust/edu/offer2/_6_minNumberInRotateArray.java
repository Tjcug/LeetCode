package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _6_minNumberInRotateArray {
    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0)
            return 0;
        int index=1;
        while (index<array.length && array[index]>=array[index-1]){
            index++;
        }
        return array[index];
    }

    public static void main(String[] args) {
        int i = _6_minNumberInRotateArray.minNumberInRotateArray(new int[]{3, 4, 5, 1, 2});
        System.out.println(i);
    }
}
