package com.hust.edu.offer;

import java.util.ArrayList;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/18.
 */
public class FindTreeNodeValue {
    private ArrayList<TreeNode> path=new ArrayList<>();
    public ArrayList<TreeNode> findTreeNodeValue(TreeNode root,int value){
        if(root==null)
            return path;
        findTreeNodeValueHelper(root,path,value);
        return path;
    }

    private void findTreeNodeValueHelper(TreeNode root,ArrayList<TreeNode> path, int value) {
        path.add(root);
        if(root.val==value) {
            return;
        }
        if(root.left!=null)
            findTreeNodeValueHelper(root.left,path,value);
        if(root.right!=null)
            findTreeNodeValueHelper(root.right,path,value);
        path.remove(path.size()-1);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
