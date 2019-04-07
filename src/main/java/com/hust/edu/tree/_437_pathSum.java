package com.hust.edu.tree;

import java.util.ArrayList;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/7.
 * LetCode 437 路径总和
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 * 找出路径和等于给定数值的路径总数。
 */
public class _437_pathSum {
    private ArrayList<ArrayList<Integer>> resultPath=new ArrayList<>();
    private ArrayList<Integer> path=new ArrayList<>();

    public int pathSum(TreeNode root, int target) {
        if(root==null)
            return resultPath.size();
        path.add(root.val);
        if (root.val==target){
            resultPath.add(new ArrayList<>(path));
        }
        if(root.left!=null){
            pathSum(root.left,target-root.val);
        }
        if(root.right!=null){
            pathSum(root.right,target-root.val);
        }
        path.remove(path.size()-1);
        return resultPath.size();
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
