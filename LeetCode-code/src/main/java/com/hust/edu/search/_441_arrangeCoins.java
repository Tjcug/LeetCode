package com.hust.edu.search;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/4/5.
 * LetCode 441 排列硬币
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 */
public class _441_arrangeCoins {
    public static int arrangeCoins(int n) {
        if(n==1)
            return 1;
        long level=1;
        long sum=0;
        while (sum+level<=n){
            sum+=level;
            level++;
        }
        return (int) (level-1);
    }

    public static void main(String[] args) {
        int i = _441_arrangeCoins.arrangeCoins(3);
        System.out.println(i);
    }
}
