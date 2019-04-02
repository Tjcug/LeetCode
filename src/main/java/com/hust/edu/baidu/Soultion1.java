package com.hust.edu.baidu;

/**
 * locate com.hust.edu.baidu
 * Created by MasterTj on 2019/4/2.
 */
public class Soultion1 {
    private static int result[];

    public static int minGasStation(int numsOfGS,int[] distOfGS,int [] allowedGasoline, int distance, int initialGasoline){
        int[] dp=new int[numsOfGS+1];
        result=new int[numsOfGS+1];
        dp[0]=initialGasoline;
        result[0]=0;
        for (int i = 1; i <= numsOfGS; i++) {
            minGasStationHelper(dp,i,distOfGS,allowedGasoline);
        }
        if(dp[numsOfGS-1]<distance)
            return -1;
        return result[numsOfGS];
    }

    private static void minGasStationHelper(int[] dp,int index,int[] distOfGS,int [] allowedGasoline){
        int low=index;
        int high=distOfGS.length-1;
        while (low<=high){
            if(dp[low-1]>=distOfGS[high]){
                break;
            }else
                high--;
        }
        dp[index]=dp[low-1]+allowedGasoline[high];
    }

    public static void main(String[] args) {
        int i = minGasStation(4, new int[]{5, 7, 8, 10}, new int[]{2, 3, 1, 5}, 15, 5);
        System.out.println(i);
    }
}
