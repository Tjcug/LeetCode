package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 */
public class _18_Mirror {
    public void Mirror(TreeNode root) {
        if(root==null)
            return;

        MirrorHelper(root);
    }

    public void MirrorHelper(TreeNode root){
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        if(root.left!=null)
            MirrorHelper(root.left);
        if(root.right!=null)
            MirrorHelper(root.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
