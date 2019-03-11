package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 */
public class _62_KthNode {
    private List<TreeNode> list=new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        KthNodeHelper(pRoot);
        if(k > list.size() || k<=0)
            return null;
        return list.get(k-1);
    }

    private void KthNodeHelper(TreeNode root){
        if(root==null)
            return;
        KthNodeHelper(root.left);
        list.add(root);
        KthNodeHelper(root.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
