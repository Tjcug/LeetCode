package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2018/11/6.
 * LetCode 5 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 */
public class _5_longestPalindrome {
//    暴力求解方法
//    public String longestPalindrome(String s) {
//       int k = s.length();
//       while (k>0){
//           for (int i = 0; i+k <= s.length(); i++) {
//               if(isPalindrome(s.substring(i,i+k)))
//                   return s.substring(i,i+k);
//           }
//           k--;
//       }
//       return "";
//    }
//
//    private boolean isPalindrome(String sub){
//        int count = 0;
//        for (int k = 0; k < sub.length() / 2; k++) {//左右对称判断
//            if (sub.charAt(k) == sub.charAt(sub.length() - k - 1))
//                count++;
//        }
//        if (count == sub.length() / 2)
//            return true;
//
//        return false;
//    }


    public String longestPalindrome(String s) {
        if(s.length()==0)
            return "";
       int start=0, end=0;
        for (int i = 0; i <s.length(); i++) {
            int i1 = expandAroundCenter(s, i, i);
            int i2 = expandAroundCenter(s, i, i + 1);
            int length= Math.max(i1,i2);
            if(length>end-start){
                start=i-(length-1)/2;
                end=i+length/2;
            }
        }
        return s.substring(start,end+1);
    }

   private int expandAroundCenter(String s, int i, int j){
        int left=i,right=j;
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
   }
}
