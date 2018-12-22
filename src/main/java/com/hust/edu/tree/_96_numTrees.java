package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2018/12/22.
 * LetCode 96 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 * G(n) = G(0)*G(n-1)+G(1)*G(n-2)+...+G(n-1)*G(0)
 */
public class _96_numTrees {
    public int numTrees(int n) {
       int dp[] =new int[n+1];
       dp[0]=1;
       dp[1]=1;
        for (int i = 2; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
}
