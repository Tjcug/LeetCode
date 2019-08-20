package com.hust.edu.depthfirst;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * LetCode 101. 对称二叉树
 */
public class _101_isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    private boolean isMirror(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        return p.val==q.val && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
