package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/7.
 * LetCode 437 路径总和
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 * 找出路径和等于给定数值的路径总数。
 */
public class _437_pathSum {
    private int pathNum;

    public int pathSum(TreeNode root, int target) {
        if(root==null)
            return pathNum;
        pathSumHelper(root,target);
        pathSum(root.left,target);
        pathSum(root.right,target);
        return pathNum;
    }

    private void pathSumHelper(TreeNode root,int target){
        if(root==null)
            return;
        if(root.val==target)
            pathNum++;
        if(root.left!=null)
            pathSumHelper(root.left,target-root.val);
        if(root.right!=null)
            pathSumHelper(root.right,target-root.val);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
