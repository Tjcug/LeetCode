package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 */
public class _18_Mirror {
    public void Mirror(TreeNode root) {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;
        //交换root节点的左子树和右子树节点
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;

        if(root.left!=null)
            Mirror(root.left);
        if(root.right!=null)
            Mirror(root.right);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
