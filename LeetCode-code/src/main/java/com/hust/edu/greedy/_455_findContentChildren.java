package com.hust.edu.greedy;

import java.util.Arrays;

/**
 * locate com.hust.edu.greedy
 * Created by MasterTj on 2019/4/5.
 * LetCode 455 分发饼干
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值 gi ，
 * 这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。如果 sj >= gi ，
 * 我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 */
public class _455_findContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        boolean[] visited=new boolean[s.length];
        for (int i = 0; i < g.length; i++) {
            int gtemp = g[i];
            for (int j = 0; j < s.length; j++) {
                if(!visited[j] && s[j]>=gtemp) {
                    count++;
                    visited[j]=true;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int contentChildren = _455_findContentChildren.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1});
        System.out.println(contentChildren);
    }

//    public int findContentChildren(int[] g, int[] s) {
//        Arrays.sort(g);
//        Arrays.sort(s);
//        int i = 0, j =0;
//        while(i<g.length && j < s.length){
//            if(g[i] <= s[j]) i++;
//            j++;
//        }
//        return i;
//    }
}
