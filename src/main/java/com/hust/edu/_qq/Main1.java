package com.hust.edu._qq;

/**
 * locate com.hust.edu._qq
 * Created by MasterTj on 2019/4/5.
 */
public class Main1 {

    public static void main(String[] args) {
        int minNumberCoin = findMinNumberCoin(20, new int[]{1, 2, 5, 10});
        System.out.println(minNumberCoin);
    }
    private static int findMinNumberCoin(int M,int[] coin){
        int res[]=new int[coin.length];

        int sum=0,ans=0;
        while(true){
            if(sum>=M){
                return ans;
            }
            for(int i=coin.length-1;i>=0;i--)   //从大到小
                if(coin[i] <= sum+1){
                    sum+=coin[i];
                    ans++;
                    break;
                }
        }
    }

    private static int getSum(int[] coin, int[] res){
        int sum=0;
        for (int i = 0; i < coin.length; i++) {
            sum+=coin[i]*res[i];
        }
        return sum;
    }
}
