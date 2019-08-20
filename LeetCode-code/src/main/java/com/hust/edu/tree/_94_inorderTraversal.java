package com.hust.edu.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2018/10/30.
 */
public class _94_inorderTraversal {
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
