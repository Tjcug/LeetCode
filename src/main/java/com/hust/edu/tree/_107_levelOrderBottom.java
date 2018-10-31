package com.hust.edu.tree;

import java.util.*;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2018/10/31.
 */
public class _107_levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root!=null)
            queue.add(root);
        List<List<Integer>> lists=new ArrayList<>();
        while (!queue.isEmpty()){
            List<Integer> integerList=new ArrayList<>();
            Queue<TreeNode> nextQueue=new ArrayDeque<>();
            while (!queue.isEmpty()){
                TreeNode poll = queue.poll();
                integerList.add(poll.val);
                if(poll.left!=null)
                    nextQueue.add(poll.left);
                if(poll.right!=null)
                    nextQueue.add(poll.right);
            }
            queue=nextQueue;
            lists.add(integerList);
        }
        Collections.reverse(lists);
        return lists;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
