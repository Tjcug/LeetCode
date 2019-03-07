package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/6.
 */
public class _26_Convert {
    TreeNode temp = null;
    TreeNode realHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertHelper(pRootOfTree);
        return realHead;
    }

    private void ConvertHelper(TreeNode root) {
        if(root==null)
            return;

        ConvertHelper(root.left);
        if(temp==null){
            temp=root;
            realHead=root;
        }else {
            temp.right=root;
            root.left=temp;
            temp=root;
        }
        ConvertHelper(root.right);
    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
