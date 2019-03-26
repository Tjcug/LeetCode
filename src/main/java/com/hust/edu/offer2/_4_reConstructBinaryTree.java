package com.hust.edu.offer2;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _4_reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        List<Integer> preList=new ArrayList<>();
        List<Integer> inorderList=new ArrayList<>();
        for (int i = 0; i < pre.length; i++) {
            preList.add(pre[i]);
        }
        for (int i = 0; i < in.length; i++) {
            inorderList.add(in[i]);
        }
        return reConstructBinaryTreeHelper(preList,inorderList);
    }

    private TreeNode reConstructBinaryTreeHelper(List<Integer> preList,List<Integer> inorderList) {
        if(preList.size()==0 || inorderList.size()==0)
            return null;
        if(preList.size()==1 && inorderList.size()==1)
            return new TreeNode(preList.get(0));

        TreeNode treeNode=new TreeNode(preList.get(0));
        int search = inorderList.indexOf(preList.get(0));
        treeNode.left=reConstructBinaryTreeHelper(preList.subList(1,search+1),inorderList.subList(0,search));
        treeNode.right=reConstructBinaryTreeHelper(preList.subList(search+1,preList.size()),inorderList.subList(search+1,inorderList.size()));
        return treeNode;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
