package com.hust.edu.queue;

/**
 * locate com.hust.edu.queue
 * Created by mastertj on 2018/10/23.
 * 363 矩阵区域不超过K的最大数值和
 */
public class _363_MaxSumSubmatrix {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if(matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int n=matrix.length;
        int m=matrix[0].length;

        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;++i){
            for(int j=1;j<=m;++j){
                dp[i][j]=matrix[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];//求(0,0)到(i,j)的面积
            }
        }

        int result=-Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                for(int t=0;t<i;t++){
                    for(int z=0;z<j;z++){
                        int rt=dp[i][j]-dp[t][j]-dp[i][z]+dp[t][z];
                        if(rt==k){ //遇到k即可跳出
                            return k;
                        }
                        if(rt<k){
                            result=Math.max(result,rt);
                        }
                    }
                }
            }
        }
        return result;
    }
}
