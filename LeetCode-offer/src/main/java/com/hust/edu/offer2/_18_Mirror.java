package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _18_Mirror {
    public void Mirror(TreeNode root) {
        if(root==null) return;
        MirrorHelper(root);
    }

    public void MirrorHelper(TreeNode root){
        if(root==null)
            return ;
        if(root.left==null && root.right==null)
            return;

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        MirrorHelper(root.left);
        MirrorHelper(root.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
