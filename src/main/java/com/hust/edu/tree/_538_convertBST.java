package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2019/4/8.
 * 538. 把二叉搜索树转换为累加树
 */
public class _538_convertBST {
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
            return null;
        convertBSTHelper(root);
        return root;
    }

    private int sum=0;
    private void convertBSTHelper(TreeNode root) {
        if(root==null)
            return;
        convertBSTHelper(root.right);
        sum+=root.val;
        root.val=sum;
        convertBSTHelper(root.left);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
