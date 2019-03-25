package com.hust.edu.recursive;

/**
 * locate com.hust.edu.recursive
 * Created by MasterTj on 2019/3/25.
 * 687. 最长同值路径
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 解题思路：令 arrow_length(node) 为从节点 node 延伸出的最长箭头的长度。如果 node.Left 存在且与节点 node 具有相同的值，
 * 则该值就会是 1 + arrow_length(node.left)。在 node.right 存在的情况下也是一样。
 * 当我们计算箭头长度时，候选答案将是该节点在两个方向上的箭头之和。我们将这些候选答案记录下来，并返回最佳答案。
 */
public class _687_longestUnivaluePath {
    private int result=Integer.MIN_VALUE;

    public int longestUnivaluePath(TreeNode root) {
        if(root==null)
            return 0;
        longestUnivaluePathHelper(root);
        return result;
    }

    private int longestUnivaluePathHelper(TreeNode root) {
        if(root==null)
            return 0;
        int left=longestUnivaluePathHelper(root.left);
        int right=longestUnivaluePathHelper(root.right);
        int arrowLeft = 0, arrowRight = 0;
        if(root.left!=null && root.left.val==root.val){
            arrowLeft=left+1;
        }
        if(root.right!=null && root.right.val==root.val){
            arrowRight=right+1;
        }
        result=Math.max(result,arrowLeft+arrowRight);
        return Math.max(arrowLeft,arrowRight);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


//    private int maxL = 0;
//    public int longestUnivaluePath(TreeNode root) {
//        if (root == null) {
//            return maxL;
//        }
//        dfs(root, root.val);
//        return maxL;
//    }
//    private int dfs(TreeNode root, int val) {
//        if (root == null) {
//            return 0;
//        }
//        int leftL = dfs(root.left, root.val);
//        int rightL = dfs(root.right, root.val);
//        maxL = Math.max(leftL + rightL, maxL);
//        if (val == root.val) {
//            // 左右子树较长的向上回溯
//            return Math.max(leftL, rightL) + 1;
//        }
//        return 0;
//    }
}
