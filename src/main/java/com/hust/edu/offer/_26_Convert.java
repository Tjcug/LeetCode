package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/6.
 * 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class _26_Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        TreeNode pListNodeInList=null;
        ConvertHelper(pRootOfTree,pListNodeInList);
        TreeNode temp=pListNodeInList;

        while (temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }

    private void ConvertHelper(TreeNode pRootOfTree, TreeNode pListNodeInList) {
        if(pRootOfTree==null)
            return;
        TreeNode current=pRootOfTree;

        if(current.left!=null){
            ConvertHelper(current.left,pListNodeInList);
        }
        current.left=pListNodeInList;
        if(pListNodeInList!=null){
            pListNodeInList.right=current;
        }
        pListNodeInList=current;
        if(current.right!=null){
            ConvertHelper(current.right,pListNodeInList);
        }

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
