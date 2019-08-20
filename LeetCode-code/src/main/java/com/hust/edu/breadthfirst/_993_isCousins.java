package com.hust.edu.breadthfirst;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * locate com.hust.edu._breadthfirst
 * Created by MasterTj on 2019/4/5.
 * LetCode 993 二叉树的堂兄弟节点
 * 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 * 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
 */
public class _993_isCousins {
    public boolean isCousins(TreeNode root, int x, int y) {
        int depthx=0,depthy=0,depth=0;
        TreeNode parentX=null,parentY=null;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();

                if(poll.left!=null){
                    queue.add(poll.left);
                    if(poll.left.val==x){
                        depthx=depth;
                        parentX=poll;
                    }
                    if(poll.left.val==y){
                        depthy=depth;
                        parentY=poll;
                    }
                }
                if(poll.right!=null) {
                    queue.add(poll.right);
                    if(poll.right.val==x){
                        depthx=depth;
                        parentX=poll;
                    }
                    if(poll.right.val==y){
                        depthy=depth;
                        parentY=poll;
                    }
                }
            }
        }
        return depthx==depthy && parentX!=parentY;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
