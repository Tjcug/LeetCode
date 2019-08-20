package com.hust.edu._ant;

/**
 * locate com.hust.edu._ant
 * Created by MasterTj on 2019/3/25.
 * 判断两个树是否相等
 */
public class isEqualTree {
    public boolean isEqual(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        if(root1.val!=root2.val){
            return false;
        }
        return isEqual(root1.left,root2.left) && isEqual(root1.right,root2.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
