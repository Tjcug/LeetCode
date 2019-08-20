package com.hust.edu.offer2;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class _24_FindPath {
    private ArrayList<ArrayList<Integer>> reusltList=new ArrayList<>();
    private ArrayList<Integer> pathList=new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null)
            return reusltList;
        pathList.add(root.val);
        if(root.val==target && root.left==null && root.right==null){
            reusltList.add(new ArrayList<>(pathList));
        }
        if(root.val<target && root.left!=null){
            FindPath(root.left,target-root.val);
        }
        if(root.val<target && root.right!=null){
            FindPath(root.right,target-root.val);
        }
        pathList.remove(pathList.size()-1);
        return reusltList;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
