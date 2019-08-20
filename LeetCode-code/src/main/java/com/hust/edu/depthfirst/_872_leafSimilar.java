package com.hust.edu.depthfirst;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * 请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
 */
public class _872_leafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafNums1 = new ArrayList<>();
        List<Integer> leafNums2 = new ArrayList<>();
        findLeafNums(leafNums1,root1);
        findLeafNums(leafNums2,root2);
        for (int i = 0; i < leafNums1.size(); i++) {
            if(i>leafNums2.size() || leafNums1.get(i)!=leafNums2.get(i))
                return false;
        }
        return true;
    }

    private void findLeafNums(List<Integer> list,TreeNode root){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            list.add(root.val);

        if(root.left!=null)
            findLeafNums(list,root.left);
        if(root.right!=null)
            findLeafNums(list,root.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
