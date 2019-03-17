package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/6.
 * 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class _26_Convert {
    private TreeNode pListNodeInList=null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        ConvertHelper(pRootOfTree);
        TreeNode temp=pRootOfTree;
        while (temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }

    private void ConvertHelper(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return;
        TreeNode current = pRootOfTree;
        if(pRootOfTree.left!=null)
            ConvertHelper(pRootOfTree.left);

        current.left=pListNodeInList;

        if(pListNodeInList!=null)
            pListNodeInList.right=current;

        pListNodeInList=current;

        if(pRootOfTree.right!=null)
            ConvertHelper(pRootOfTree.right);

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
