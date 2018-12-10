package com.hust.edu.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * locate com.hust.edu.sort
 * Created by MasterTj on 2018/12/10.
 * LetCode 179 最大数字
 */
public class _179_largestNumber {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i=0; i<nums.length; i++)
            strs[i] = Integer.toString(nums[i]);

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) return s2.compareTo(s1);
                return (s2+s1).compareTo(s1+s2);
            }
        });

        if ("0".equals(strs[0])) return "0";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }
}
