package com.hust.edu.depthfirst;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * LetCode 257. 二叉树的所有路径
 */
public class _257_binaryTreePaths {
    private List<List<String>> result=new ArrayList<>();
    private List<String> path=new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null)
           return list;
        binaryTreePathsHelper(root);
        System.out.println(result);
        for(List<String> temp : result){
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < temp.size(); i++) {
                sb.append(temp.get(i));
                if(i!=temp.size()-1)
                    sb.append("->");
            }
            list.add(sb.toString());
        }
        return list;
    }

    private void binaryTreePathsHelper(TreeNode root){
        if(root==null)
            return;
        path.add(String.valueOf(root.val));
        if(root.left==null && root.right==null) {
            result.add(new ArrayList<>(path));
        }
        if(root.left!=null)
            binaryTreePaths(root.left);
        if(root.right!=null)
            binaryTreePaths(root.right);
        path.remove(path.size()-1);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
