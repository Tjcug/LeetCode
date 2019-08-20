package com.hust.edu.tree;

import java.util.*;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2019/3/27.
 * 二叉树的遍历
 */
public class TreeNodePath {
    private ArrayList<TreeNode> resultList=new ArrayList<>();

    public TreeNode buildTree(Scanner in){
        String str = in.next();
        TreeNode treeNode=null;
        if(str.equals("#"))
            return null;
        else {
            treeNode=new TreeNode(Integer.valueOf(str));
            treeNode.left=buildTree(in);
            treeNode.right=buildTree(in);
        }
        return null;
    }

    public void levelOrderTraverse(TreeNode root){
        if(root==null)
            return;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            resultList.add(treeNode);
            if(treeNode.left!=null)
                queue.add(treeNode.left);
            if(treeNode.right!=null)
                queue.add(treeNode.right);
        }
    }

    /**
     * 递归前序遍历
     * @param treeNode
     */
    public void treeNodePrePathHelper(TreeNode treeNode){
        if(treeNode==null)
            return;
        resultList.add(treeNode);
        treeNodePrePathHelper(treeNode.left);
        treeNodePrePathHelper(treeNode.right);
    }

    /**
     * 中序遍历
     * @param treeNode
     */
    public void treeNodeInOrdreHelper(TreeNode treeNode){
        if(treeNode==null)
            return;;
        treeNodeInOrdreHelper(treeNode.left);
        resultList.add(treeNode);
        treeNodePrePathHelper(treeNode.right);
    }

    /**
     * 后序遍历
     * @param treeNode
     */
    public void treeNodeUnOrdreHelper(TreeNode treeNode){
        if(treeNode==null)
            return;;
        treeNodeInOrdreHelper(treeNode.left);
        treeNodePrePathHelper(treeNode.right);
        resultList.add(treeNode);
    }

    public void treeNodePrePathStackHelper(TreeNode treeNode){
        if(treeNode==null)
            return;
        TreeNode preNode=treeNode;
        Stack<TreeNode> stack=new Stack<>();
        while (preNode!=null && !stack.isEmpty()){
            if(preNode!=null){
                resultList.add(preNode);
                stack.push(treeNode);
                preNode=preNode.left;
            }else {
                TreeNode pop = stack.pop();
                preNode=pop.right;
            }
        }
    }

    public void treeNodeInOrdreStackHelper(TreeNode treeNode){
        if(treeNode==null)
            return;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode preNode=treeNode;
        while (preNode!=null && !stack.isEmpty()){
            if(preNode!=null){
                stack.push(treeNode);
                preNode=treeNode.left;
            }else {
                TreeNode pop = stack.pop();
                resultList.add(pop);
                preNode=pop.right;
            }
        }
    }

    public void treeNodeUnOrdreStackHelper(TreeNode treeNode){
        if(treeNode==null)
            return;
        TreeNode preNode=null;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(treeNode);
        stack.push(treeNode);
        while (!stack.isEmpty()){
            preNode= stack.pop();
            if(!stack.isEmpty() && preNode==stack.peek()){
                if(preNode.left!=null){
                    stack.push(preNode.left);
                    stack.push(preNode.left);
                }

                if(preNode.right!=null){
                    stack.push(preNode.right);
                    stack.push(preNode.right);
                }
            }else {
                resultList.add(preNode);
            }
        }
    }
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}
