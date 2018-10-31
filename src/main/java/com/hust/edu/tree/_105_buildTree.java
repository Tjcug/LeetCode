package com.hust.edu.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2018/10/31.
 */
public class _105_buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preorderList=new ArrayList<>();
        List<Integer> inorderList=new ArrayList<>();
        for(int i=0;i<preorder.length; i++){
            preorderList.add(preorder[i]);
        }

        for(int i=0;i<inorder.length; i++){
            inorderList.add(inorder[i]);
        }
        TreeNode root;
        return buildTreeHelper(preorderList,inorderList);
    }

    public TreeNode buildTreeHelper(List<Integer> preorder, List<Integer> inorder) {
        if(preorder.size()==1 || inorder.size()==1){
            return new TreeNode(preorder.get(0));
        }
        if(preorder.size()==0 || inorder.size()==0)
            return null;
        int search = inorder.indexOf(preorder.get(0));
        TreeNode treeNode=new TreeNode(preorder.get(0));
        treeNode.left=buildTreeHelper(preorder.subList(1,search+1),inorder.subList(0,search));
        treeNode.right=buildTreeHelper(preorder.subList(search+1,preorder.size()),inorder.subList(search+1,inorder.size()));
        return treeNode;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        _105_buildTree buildTree=new _105_buildTree();
        buildTree.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
    }
}
