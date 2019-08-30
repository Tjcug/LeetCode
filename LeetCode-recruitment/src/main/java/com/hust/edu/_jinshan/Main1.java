package com.hust.edu._jinshan;

/**
 * locate com.hust.edu._jinshan
 * Created by MasterTj on 2019/8/30.
 */
public class Main1 {
    public static int longestMonotone(String str, boolean isIncreasing){
        if(str.length()==0)
            return 0;
        int size = str.length();
        //dp[i] 指的就是str中前i个元素的最长单调递增子序列的个数,必须以str[i]结尾
        int dp[]=new int[size+1];
        //dp[i]的值是前面所有小于a[i]的数组的dp[i]的最大值+1；
        int result=Integer.MIN_VALUE;
        for (int i = 1; i <= str.length(); i++) {
            int max=0;
            for (int j = 1; j <= i; j++) {
                if(isIncreasing){
                    if(str.charAt(j-1) < str.charAt(i-1)){
                        max=Math.max(max,dp[j]);
                    }
                }else {
                    if(str.charAt(j-1) > str.charAt(i-1)){
                        max=Math.max(max,dp[j]);
                    }
                }
            }
            dp[i]=max+1;
            result=Math.max(result,dp[i]);
        }
        return result;
    }

    public static int findMaxSubStringLength(String str){
        int result[]=new int[str.length()];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb1=new StringBuilder(str.substring(0,i+1));
            StringBuilder sb2=new StringBuilder(str.substring(i,str.length()));
            int l1 = longestMonotone(sb1.toString(), true);
            int l2 = longestMonotone(sb2.toString(), false);
            result[i] = l1 + l2 -1;
            max = Math.max(max,result[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int maxSubString = findMaxSubStringLength("1461521");
        System.out.println(maxSubString);
    }
}
