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
        List<Integer> inList=new ArrayList<>();
        for (int i = 0; i < pre.length; i++) {
            preList.add(pre[i]);
        }
        for (int i = 0; i < in.length; i++) {
            inList.add(in[i]);
        }
        return reConstructBinaryTreeHelper(preList,inList);
    }

    private TreeNode reConstructBinaryTreeHelper(List<Integer> preList,List<Integer> inList){
        if(preList.size()==0 || inList.size()==0)
            return null;
        if(preList.size()==1 && inList.size()==1)
            return new TreeNode(preList.get(0));
        int search = inList.indexOf(preList.get(0));
        TreeNode treeNode=new TreeNode(preList.get(0));
        treeNode.left=reConstructBinaryTreeHelper(preList.subList(1,search+1),inList.subList(0,search));
        treeNode.right=reConstructBinaryTreeHelper(preList.subList(search+1,preList.size()),inList.subList(search+1,inList.size()));
        return treeNode;
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
