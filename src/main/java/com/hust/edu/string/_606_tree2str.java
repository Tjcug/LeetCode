package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 606. 根据二叉树创建字符串
 * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 */
public class _606_tree2str {

    public String tree2str(TreeNode t) {
        if(t==null)
            return "";
        StringBuilder sb=new StringBuilder();
        tree2strHelper(t,sb);
        return sb.toString();
    }

    public void tree2strHelper(TreeNode treeNode,StringBuilder sb){
        if(treeNode == null)
            return;
        sb.append(treeNode.val);
        if(treeNode.left == null && treeNode.right != null)
            sb.append("()");

        if(treeNode.left != null){
            sb.append("(");
            tree2strHelper(treeNode.left,sb);
            sb.append(")");
        }

        if(treeNode.right != null){
            sb.append("(");
            tree2strHelper(treeNode.right,sb);
            sb.append(")");
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
