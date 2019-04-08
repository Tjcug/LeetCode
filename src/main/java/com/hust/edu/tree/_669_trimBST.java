package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/8.
 * 669. 修剪二叉搜索树
 * 给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L)
 * 。你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点。
 */
public class _669_trimBST {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null) return null;
        else{
            root.left=trimBST(root.left,L,R);
            root.right=trimBST(root.right,L,R);
            if(root.val<L)
                return root.right;
            if(root.val>R)
                return root.left;
        }
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
