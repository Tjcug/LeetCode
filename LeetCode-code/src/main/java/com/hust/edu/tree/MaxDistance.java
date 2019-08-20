package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2019/3/27.
 * 二叉树的最长路径
 * 给定一个二叉树，任意两个节点之间必然是有一条路径相通的，假定父节点和它的孩子节点的距离为单位1，求二叉树中相距最远的两个节点间的路径长度
 */
public class MaxDistance {
    int max=0;
    //求得treeeNode的高度，叶子节点高度为0
    public int maxDistance(TreeNode treeNode){
        if(treeNode.left==null && treeNode.right==null)
            return 0;
        int left=0,right=0;
        if(treeNode.left!=null)
            left=maxDistance(treeNode.left);
        if(treeNode.right!=null)
            right=maxDistance(treeNode.right);
        int result=left>right?left:right;

        max=Math.max(max,left+right+2);
        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
