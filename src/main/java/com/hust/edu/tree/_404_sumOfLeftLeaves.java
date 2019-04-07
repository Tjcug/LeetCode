package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/7.
 * LetCode 左叶子之和
 * 计算给定二叉树的所有左叶子之和。
 */
public class _404_sumOfLeftLeaves {
    private int sum=0;

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        sumOfLeftLeavesHelper(root,0);
        return sum;
    }

    private void sumOfLeftLeavesHelper(TreeNode treeNode,int val){
        if(treeNode==null)
            return;
        if(treeNode.left==null && treeNode.right==null) {
            sum += val;
            return;
        }
        if(treeNode.left!=null) {
            sumOfLeftLeavesHelper(treeNode.left,treeNode.left.val);
        }
        sumOfLeftLeavesHelper(treeNode.right,0);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
