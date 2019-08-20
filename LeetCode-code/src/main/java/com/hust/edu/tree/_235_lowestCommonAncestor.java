package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2018/12/6.
 * LetCode 235 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 */
public class _235_lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((root.val - p.val)*(root.val - q.val) <= 0){
            return root;
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p , q);
        }else{
            return lowestCommonAncestor(root.left, p , q);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
