package com.hust.edu.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/8.
 * 653. 两数之和 IV - 输入 BST
 * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 */
public class _653_findTarget {
    private Set<Integer> set=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
            return false;
        if(set.contains(root.val)){
            return true;
        }else set.add(k-root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
