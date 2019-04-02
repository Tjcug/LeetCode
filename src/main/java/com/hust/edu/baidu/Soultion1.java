package com.hust.edu.baidu;

/**
 * locate com.hust.edu.baidu
 * Created by MasterTj on 2019/4/2.
 * 百度笔试第一题
 */
public class Soultion1 {

    public static int minGasStation(int numsOfGS,int[] distOfGS,int [] allowedGasoline, int distance, int initialGasoline){
        int[] dp=new int[numsOfGS+1];
        int[] result=new int[numsOfGS+1];
        dp[0]=initialGasoline;
        result[0]=0;
        for (int i = 1; i <= numsOfGS; i++) {
            minGasStationHelper(dp,result,i,distOfGS,allowedGasoline);
        }
        if(dp[numsOfGS]+allowedGasoline[numsOfGS-1]<distance)
            return -1;
        return result[numsOfGS];
    }

    private static void minGasStationHelper(int[] dp,int[] result,int index,int[] distOfGS,int [] allowedGasoline){
        int low=index;
        for (int i = 0; i < low; i++) {
            if(dp[i]>=distOfGS[index-1]){
                dp[index]=dp[i]+allowedGasoline[index-1];
                result[index]=result[i]+1;
                return;
            }
        }
        dp[index]=-1;
    }

    public static void main(String[] args) {
        int i = minGasStation(4, new int[]{5, 7, 8, 10}, new int[]{2, 3, 1, 5}, 15, 5);
        System.out.println(i);
    }
}
