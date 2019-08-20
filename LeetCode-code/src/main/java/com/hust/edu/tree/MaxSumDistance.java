package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2019/3/27.
 * 二叉树的最长路径和
 * 下面再看最大路径和问题（路径和为两个节点之间所在路径上的节点权值之和）。这个问题和上题非常相似，只不过是把单位距离换成了节点上的权值而已。
 */
public class MaxSumDistance {
    int max=0;
    //求得treeeNode的最长路径和,叶子节点的最长路径和为叶子节点的权值
    public int maxSumDistance(TreeNode treeNode){
        if(treeNode.left==null && treeNode.right==null)
            return treeNode.val;

        int left=0,right=0;
        if(treeNode.left!=null)
            left=maxSumDistance(treeNode.left)+treeNode.val;
        if(treeNode.right!=null)
            right=maxSumDistance(treeNode.right)+treeNode.val;

        int result=left>right?left:right;
        int sumMax=left+right-treeNode.val;
        max=Math.max(max,sumMax);
        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
