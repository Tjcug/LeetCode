package com.hust.edu.offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 */
public class _59_Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(pRoot==null)
            return result;

        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(pRoot);
        int rows=1;
        while (!queue.isEmpty()){
            ArrayList list=new ArrayList();
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if(rows % 2 ==0){
                    list.add(0,poll.val);
                }else {
                    list.add(poll.val);
                }
                if(poll.left!=null)
                    queue.add(poll.left);
                if(poll.right!=null)
                    queue.add(poll.right);
            }
            result.add(list);
            rows++;
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
