package com.hust.edu.depthfirst;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * LetCode 111 111. 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 */
public class _111_minDepth {
    public int minDepth(TreeNode root) {
        return minDepthHelper(root);
    }

    private int minDepthHelper(TreeNode root){
        if(root==null)
            return 0;
        int left=minDepthHelper(root.left);
        int right=minDepthHelper(root.right);
        if(root.left==null)
            return right+1;
        if(root.right==null)
            return left+1;
        return left<right? left+1:right+1;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
