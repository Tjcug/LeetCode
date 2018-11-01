package com.hust.edu.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2018/11/1.
 */
public class _110_isBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(!isBalancedHelper(treeNode))
                return false;
            if(treeNode.left!=null) {
                if(!isBalancedHelper(treeNode.left))
                    return false;
                    queue.add(treeNode.left);
            }
            if(treeNode.right!=null){
                if(!isBalancedHelper(treeNode.right))
                    return false;
                queue.add(treeNode.right);
            }
        }

        return true;
    }

    private boolean isBalancedHelper(TreeNode treeNode){
        return Math.abs(getHeight(treeNode.left)-getHeight(treeNode.right)) <= 1;
    }

    private int getHeight(TreeNode treeNode){
        if(treeNode==null){
            return 0;
        }
        return Math.max(getHeight(treeNode.left),getHeight(treeNode.right))+1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
