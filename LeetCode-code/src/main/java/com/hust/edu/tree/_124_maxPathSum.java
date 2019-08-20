package com.hust.edu.tree;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2018/11/1.
 */
public class _124_maxPathSum {
    private int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        compute(root);
        return res;
    }
    private int compute(TreeNode root){
        if(root == null){
            return 0;
        }
        //经过左节点的路径的最大和
        int lMax = compute(root.left);
        //经过右节点的路径的最大和
        int rMax = compute(root.right);
        //以当前节点为根节点的路径最大和
        res = Math.max(res,Math.max(0,lMax)+Math.max(0,rMax)+root.val);
        //返回 经过当前节点的路径最大和
        return Math.max(0,Math.max(lMax,rMax)+root.val);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
