package com.hust.edu.offer;

import java.util.*;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/18.
 * 二叉树的遍历
 */
public class TreeNodePath {
    private ArrayList<TreeNode> result=new ArrayList<>();

    public ArrayList<TreeNode> treeNodePath(TreeNode root){
        if(root==null)
            return result;
        treeNodePrePathHelper(root);
        return result;
    }
    //前序遍历递归用法
    private void treeNodePrePathHelper(TreeNode root) {
        if(root==null)
            return;
        result.add(root);
        treeNodePrePathHelper(root.left);
        treeNodePrePathHelper(root.right);
    }

    //前序遍历非递归用法
    private void treeNodePrePathHelperStack(TreeNode root) {
        if(root==null)
            return;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode pNode=root;
        while (pNode!=null ||!stack.isEmpty()){
            if(pNode!=null){
                stack.push(pNode);
                pNode=pNode.left;
            }else {//!stack.isEmpty()
                TreeNode pop = stack.pop();
                pNode=pop.right;
            }
        }
    }

    //中序遍历递归用法
    private void treeNodeInPathHelper(TreeNode root) {
        if(root==null)
            return;
        treeNodePrePathHelper(root.left);
        result.add(root);
        treeNodePrePathHelper(root.right);
    }

    //中序遍历非递归用法
    private void treeNodeInPathHelperStack(TreeNode root) {
        if(root==null)
            return;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode pNode=root;
        while (pNode!=null ||!stack.isEmpty()){
            if(pNode!=null){
                stack.push(pNode);
                pNode=pNode.left;
            }else {//!stack.isEmpty
                TreeNode pop = stack.pop();
                result.add(pop);
                pNode=pop.right;
            }
        }
    }

    //后序遍历递归用法
    private void treeNodeUnderPathHelper(TreeNode root) {
        if(root==null)
            return;
        treeNodePrePathHelper(root.left);
        treeNodePrePathHelper(root.right);
        result.add(root);
    }

    //后序遍历非递归用法
    //对于每个节点，都压入两遍，在循环体中，每次弹出一个节点赋给p，如果p仍然等于栈的头结点，说明p的孩子们还没有被操作过，应该把它的孩子们加入栈中，
    //否则，访问p。也就是说，第一次弹出，将p的孩子压入栈中，第二次弹出，访问p。
    private void treeNodeUnderPathHelperStack(TreeNode root) {
        if(root==null)
            return;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        stack.push(root);
        TreeNode pNode=null;
        while (!stack.isEmpty()){
            pNode = stack.pop();
            if(!stack.isEmpty() && stack.peek()==pNode){
                if(pNode.left!=null) {
                    stack.push(pNode.left);
                    stack.push(pNode.left);
                }
                if(pNode.right!=null) {
                    stack.push(pNode.right);
                    stack.push(pNode.right);
                }
            }else
                result.add(pNode);
        }
    }

    //深度优先遍历
    private void depthOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    //层次遍历
    private void levelOrderTraverse(TreeNode root) {
        if(root==null)
            return;
        Queue<TreeNode> queue=new ArrayDeque<>();
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            result.add(poll);
            if(poll.left!=null)
                queue.add(poll.left);
            if(poll.right!=null)
                queue.add(poll.right);
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
