package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 */
public class _17_HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null)
            return false;
        return HasSubtreeHelper(root1,root2) || HasSubtreeHelper(root1.left,root2) || HasSubtreeHelper(root1.right,root2);
    }

    public boolean HasSubtreeHelper(TreeNode root1,TreeNode root2) {
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        return root1.val==root2.val && HasSubtreeHelper(root1.left,root2.left) && HasSubtreeHelper(root1.right,root2.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
