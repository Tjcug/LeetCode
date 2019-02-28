package com.hust.edu.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 */
public class _4_reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        List<Integer> preorderList=new ArrayList<>();
        List<Integer> inorderList=new ArrayList<>();
        for(int i=0;i<pre.length; i++){
            preorderList.add(pre[i]);
        }

        for(int i=0;i<in.length; i++){
            inorderList.add(in[i]);
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
}
