package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/8.
 * 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 */
public class _543_diameterOfBinaryTree {
    private int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        max=Math.max(max,getDepth(root.left)+getDepth(root.right));
        return max;
    }

    private int getDepth(TreeNode treeNode){
        if(treeNode==null)
            return 0;
        return Math.max(getDepth(treeNode.left),getDepth(treeNode.right))+1;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
