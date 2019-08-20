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
        return reConstructBinaryTreeHelper(preorderList,inorderList);
    }

    private TreeNode reConstructBinaryTreeHelper(List<Integer> preorderList, List<Integer> inorderList) {
        if(preorderList.size()==0 || inorderList.size()==0)
            return null;
        if(preorderList.size()==1 && inorderList.size()==1)
            return new TreeNode(preorderList.get(0));

        Integer target = preorderList.get(0);
        int search = inorderList.indexOf(target);//其中有search左边有search个元素
        TreeNode treeNode=new TreeNode(target);
        //preorderList.subList(a,b) 其中b-a为最后result的size 左闭右开区间
        treeNode.left=reConstructBinaryTreeHelper(preorderList.subList(1,search+1),inorderList.subList(0,search));
        treeNode.right=reConstructBinaryTreeHelper(preorderList.subList(search+1,preorderList.size()),inorderList.subList(search+1,inorderList.size()));
        return treeNode;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
