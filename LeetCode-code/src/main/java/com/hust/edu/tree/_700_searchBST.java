package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/8.
 * 700. 二叉搜索树中的搜索
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 */
public class _700_searchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val== val) return root;
        if(root.val<val) return searchBST(root.right,val);
        if(root.val>val) return searchBST(root.left,val);
        return null;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
