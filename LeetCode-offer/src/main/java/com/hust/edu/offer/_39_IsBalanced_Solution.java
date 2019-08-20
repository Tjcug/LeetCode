package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _39_IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        return Math.abs(TreeDepth(root.left)-TreeDepth(root.right))<=1;
    }

    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
