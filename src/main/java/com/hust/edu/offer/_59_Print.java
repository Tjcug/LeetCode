package com.hust.edu.offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class _59_Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(pRoot==null)
            return result;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            ArrayList<Integer> arrayList=new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                arrayList.add(node.val);
                if(node.left!=null)
                queue.add(node.left);
                if(node.right!=null)
                queue.add(node.right);
            }
            result.add(arrayList);
        }
        for (int i = 0; i < result.size(); i++) {
            if(i%2!=0){
                Collections.reverse(result.get(i));
            }
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
