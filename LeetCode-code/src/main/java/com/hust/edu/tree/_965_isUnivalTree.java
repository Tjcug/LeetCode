package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/8.
 * 965. 单值二叉树
 */
 public class _965_isUnivalTree {
    private int val=0;

    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        val=root.val;
        return isUnivalTreeHelper(root);
    }

    private boolean isUnivalTreeHelper(TreeNode root) {
        if(root==null) return true;
        return root.val==val && isUnivalTreeHelper(root.left) && isUnivalTreeHelper(root.right);
    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
