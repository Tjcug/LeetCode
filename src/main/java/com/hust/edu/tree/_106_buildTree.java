package com.hust.edu.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2018/10/31.
 */
public class _106_buildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> postorderList=new ArrayList<>();
        List<Integer> inorderList=new ArrayList<>();
        for(int i=0;i<postorder.length; i++){
            postorderList.add(postorder[i]);
        }

        for(int i=0;i<inorder.length; i++){
            inorderList.add(inorder[i]);
        }
        TreeNode root;
        return buildTreeHelper(postorderList,inorderList);
    }

    public TreeNode buildTreeHelper(List<Integer> postorder, List<Integer> inorder) {
        if(postorder.size()==1 || inorder.size()==1){
            return new TreeNode(postorder.get(0));
        }
        if(postorder.size()==0 || inorder.size()==0)
            return null;
        int search = inorder.indexOf(postorder.get(postorder.size()-1));
        TreeNode treeNode=new TreeNode(postorder.get(postorder.size()-1));
        treeNode.left=buildTreeHelper(postorder.subList(0,search),inorder.subList(0,search));
        treeNode.right=buildTreeHelper(postorder.subList(search,postorder.size()-1),inorder.subList(search+1,inorder.size()));
        return treeNode;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
