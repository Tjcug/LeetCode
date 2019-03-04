package com.hust.edu.offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 */
public class _22_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        ArrayList<Integer> arrayList=new ArrayList();
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode treeNode=queue.remove();
            arrayList.add(treeNode.val);
            if(treeNode.left!=null)
                queue.add(treeNode.left);

            if(treeNode.right!=null)
                queue.add(treeNode.right);
        }
        return arrayList;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
