package com.hust.edu._qq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * locate com.hust.edu._qq
 * Created by MasterTj on 2019/4/5.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int nLength=in.nextInt();
            int[] attack=new int[nLength];
            int[] coin=new int[nLength];
            for (int i = 0; i < nLength; i++) {
                attack[i]=in.nextInt();
            }
            for (int i = 0; i < nLength; i++) {
                coin[i]=in.nextInt();
            }
            int minCoin = findMinCoin(nLength, attack, coin);
            System.out.println(minCoin);
        }
    }

    private static int findMinCoin(int nLength, int[] attack,int[] coin ){
        List<Monstor> monstors=new ArrayList<>();
        for (int i = 0; i < nLength; i++) {
            monstors.add(new Monstor(i,attack[i],coin[i]));
        }

        int dp[]=new int[nLength];
        int res[]=new int[nLength];
        dp[0]=coin[0];
        res[0]=attack[0];
        monstors.get(0).visited=true;
        for (int i = 1; i < nLength; i++) {
            if(attack[i]>res[i-1]){
                //如果怪兽比较厉害，并且之前都visited
                int sumAttack=res[i-1],sumCoin=0;
                boolean m_bool=false;
                List<Monstor> temp=new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    if(!monstors.get(j).visited){
                        temp.add(monstors.get(j));
                    }
                }
                Collections.sort(temp);
                for (int j = 0; j < temp.size(); j++) {
                    sumAttack+=attack[j];
                    sumCoin+=coin[j];
                    if(sumAttack>attack[i]){
                        if(sumCoin<coin[i]){
                            dp[i]=sumCoin+dp[i-1];
                            res[i]=sumAttack;
                            //标记访问过了
                            for (int k = 0; k <= j; k++) {
                                temp.get(k).visited=true;
                            }
                            m_bool=true;
                        }
                        break;
                    }
                }

                if(!m_bool) {
                    dp[i] = dp[i - 1] + coin[i];
                    res[i] = res[i - 1] + attack[i];
                    monstors.get(i).visited = true;
                }
            }
        }

        return dp[nLength-1];
    }

    private static class Monstor implements Comparable<Monstor>{
        int index;
        int attack;
        int coin;
        int aToCoin;
        boolean visited;

        public Monstor(int index, int attack, int coin) {
            this.index = index;
            this.attack = attack;
            this.coin = coin;
            this.aToCoin=attack/coin;
        }


        @Override
        public int compareTo(Monstor o) {
            return -(this.aToCoin-o.aToCoin);
        }

        @Override
        public boolean equals(Object obj) {
            return this.hashCode()==obj.hashCode();
        }

        @Override
        public int hashCode() {
            return this.index;
        }
    }
}
