package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/2/28.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class _13_reOrderArray {
    public void reOrderArray(int [] array) {
        List<Integer> alist=new ArrayList<>();
        List<Integer> blist=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                alist.add(array[i]);
            }else
                blist.add(array[i]);
        }
        System.out.println(alist);
        System.out.println(blist);
        alist.addAll(blist);
        for (int i = 0; i < alist.size(); i++) {
            array[i]=alist.get(i);
        }
    }

    public static void main(String[] args) {
        _13_reOrderArray reOrderArray=new _13_reOrderArray();
        reOrderArray.reOrderArray(new int[]{2,4,6,1,3,5,7});
    }
}
