package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/8.
 * 617. 合并二叉树
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 */
public class _617_mergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null)return null;
        if(t1==null) return t2;
        if(t2==null) return t1;
        int sum = t1.val + t2.val;
        TreeNode treeNode=new TreeNode(sum);
        treeNode.left=mergeTrees(t1.left,t2.left);
        treeNode.right=mergeTrees(t1.right,t2.right);
        return treeNode;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
