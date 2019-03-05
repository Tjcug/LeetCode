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

    private void ConvertHelper(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return;
        ConvertHelper(pRootOfTree.left);
        if (temp == null) {
            temp = pRootOfTree;
            realHead = pRootOfTree;
        } else {
            temp.right = pRootOfTree;
            pRootOfTree.left = temp;
            temp = pRootOfTree;
        }
        ConvertHelper(pRootOfTree.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
