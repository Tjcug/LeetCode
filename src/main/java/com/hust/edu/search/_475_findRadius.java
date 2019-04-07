package com.hust.edu.search;

import java.util.Arrays;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/4/7.
 */
public class _475_findRadius {
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int index=0;
        int minimum =Integer.MIN_VALUE;
        for (int i = 0; i < houses.length; i++){
            while( index+1 < heaters.length ){
                if((Math.abs(heaters[index] - houses[i]) >= Math.abs(heaters[index+1] - houses[i])))
                    index++;
                else
                    break;
            }
            //判断当前的房子离哪个加热器近，如果离左边的加热器比较近，更新最小半径为 以前的 和 这次中的较大的
            //如果离右边加热器比较近，遍历下一个加热器
            //如[1,2,3,4],[1,4]    1，2离1近，3，4离4近，距离差最大是1
            minimum = Math.max(minimum,Math.abs(heaters[index] - houses[i]));
        }
        return minimum;
    }

    public static void main(String[] args) {
        int radius = _475_findRadius.findRadius(new int[]{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923}, new int[]{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612});
        System.out.println(radius);
    }
}
