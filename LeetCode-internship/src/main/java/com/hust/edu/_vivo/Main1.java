package com.hust.edu._vivo;

import java.util.ArrayList;

/**
 * locate com.hust.edu._vivo
 * Created by MasterTj on 2019/6/4.
 */
public class Main1 {
    public static void solution(int[] arry1, int[] arry2){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < arry1.length; i++) {
            arrayList.add(arry1[i]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arry2.length; j++) {
                if(arrayList.get(i)==arry2[j]){
                    arrayList.remove(i);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,5,3,6,8,1},new int[]{2,3,4});
    }
}
