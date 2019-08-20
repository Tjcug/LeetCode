package com.hust.edu.offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 */
public class _60_Print {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(pRoot==null)
            return result;

        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int size=queue.size();
            ArrayList list=new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            result.add(list);
        }
        return result;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
