package com.hust.edu.depthfirst;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * LetCode 112 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
public class _112_hasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        return hasPathSumHelper(root,sum);
    }

    private boolean hasPathSumHelper(TreeNode root,int target){
        if(root==null)
            return false;
        if(root.val==target && root.left==null && root.right==null)
            return true;
        return hasPathSumHelper(root.left,target-root.val) || hasPathSumHelper(root.right,target-root.val);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
