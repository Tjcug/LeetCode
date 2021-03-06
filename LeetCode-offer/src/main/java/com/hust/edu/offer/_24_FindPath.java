package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class _24_FindPath {
    private ArrayList<ArrayList<Integer>> pathList =new ArrayList<>();
    private ArrayList<Integer> path=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null)
            return pathList;
        path.add(root.val);
        if(root.val==target && root.right==null && root.left==null){
            pathList.add(new ArrayList<>(path));
        }
        if(root.left!=null && root.val<target){
            FindPath(root.left,target-root.val);
        }
        if(root.right!=null && root.val<target){
            FindPath(root.right,target-root.val);
        }
        path.remove(path.size()-1);
        return pathList;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
