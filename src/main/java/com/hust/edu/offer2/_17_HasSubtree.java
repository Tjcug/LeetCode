package com.hust.edu.offer2;

/**
 * locate com.hust.edu.offer2
 * Created by MasterTj on 2019/3/26.
 */
public class _17_HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null)
            return false;
        return HasSubtreeHelper(root1,root2) || HasSubtreeHelper(root1.left,root2) || HasSubtreeHelper(root1.right,root2);
    }

    /**
     * 判断root2是否是root1的子结构，如果root1和root2的值相等 则递归比较
     * @param root1
     * @param root2
     * @return
     */
    private boolean HasSubtreeHelper(TreeNode root1,TreeNode root2) {
        if(root2==null) return true;
       if(root1==null) return false;
       return root1.val==root2.val && HasSubtreeHelper(root1.left,root2.left) && HasSubtreeHelper(root1.right,root2.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
