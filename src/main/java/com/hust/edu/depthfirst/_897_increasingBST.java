package com.hust.edu.depthfirst;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * LetCode 897 递增顺序查找树
 * 给定一个树，按中序遍历重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 */
public class _897_increasingBST {
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        TreeNode dumpyNode=new TreeNode(-1);
        TreeNode temp=dumpyNode;
        for (int i = 0; i < list.size(); i++) {
            temp.right=new TreeNode(list.get(i));
            temp=temp.right;
        }
        return dumpyNode.right;
    }
    List<Integer> list = new ArrayList<Integer>();

    void inorder(TreeNode t){
        if(t == null)
            return;
        inorder(t.left);
        list.add(t.val);
        inorder(t.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
