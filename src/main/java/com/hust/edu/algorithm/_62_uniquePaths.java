package com.hust.edu.algorithm;

/**
 * locate com.hust.edu.algorithm
 * Created by MasterTj on 2018/12/7.
 * LetCode 62 不同路径 很经典的题目.
 */
public class _62_uniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 1;
                else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

}
