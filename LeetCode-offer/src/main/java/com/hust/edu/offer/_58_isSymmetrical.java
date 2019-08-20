package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 */
public class _58_isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null)
            return true;
        return isSymmetricalHelper(pRoot.left,pRoot.right);
    }

    boolean isSymmetricalHelper(TreeNode left,TreeNode right){
        if(left==null && right==null)
            return true;
       if(left==null || right==null)
           return false;
        if(left.val==right.val){
            return isSymmetricalHelper(left.left,right.right) && isSymmetricalHelper(left.right,right.left);
        }
        return false;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
