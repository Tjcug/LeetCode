package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 */
public class _24_FindPath {
    private ArrayList<ArrayList<Integer>> pathList =new ArrayList<>();
    private ArrayList<Integer> path=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null)
            return pathList;
        path.add(root.val);
        if(root.left==null && root.right==null && root.val==target){
            pathList.add(new ArrayList<>(path));
        }
        if(root.val<=target && root.left!=null){
            FindPath(root.left,target-root.val);
        }
        if(root.val<=target && root.right!=null){
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
