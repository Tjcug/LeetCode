package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2018/12/7.
 * LetCode 236 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 */
public class _236_lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left!=null && right!=null)
            return root;
        else if(left!=null)
            return left;
        else if(right!=null)
            return right;

        return null;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
