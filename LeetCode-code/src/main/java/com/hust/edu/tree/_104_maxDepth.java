package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2018/10/30.
 */
public class _104_maxDepth {

    public int maxDepth(TreeNode root) {
         if(root==null){
             return 0;
         }
         return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


}
