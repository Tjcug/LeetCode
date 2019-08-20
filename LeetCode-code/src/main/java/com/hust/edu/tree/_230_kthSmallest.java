package com.hust.edu.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2018/12/4.
 * LetCode 230 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 */
public class _230_kthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = inorderTraversal(root);
        return list.get(k-1);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curt=root;
        List<Integer> integerList=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        while (!stack.isEmpty() || curt!=null){
            while (curt != null){
                stack.push(curt);
                curt=curt.left;
            }
            curt = stack.pop();
            integerList.add(curt.val);
            curt=curt.right;
        }
        return integerList;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
