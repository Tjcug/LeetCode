package com.hust.edu.depthfirst;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * LetCode 108 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 */
public class _108_sortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        return sortedArrayToBSTHelper(list,0,list.size()-1);
    }

    public static TreeNode sortedArrayToBSTHelper(List<Integer> numsList, int left,int right){
        if(left>right)return null;
        int mid=(left+right)/2;
        TreeNode treeNode=new TreeNode(numsList.get(mid));
        treeNode.left=sortedArrayToBSTHelper(numsList,left,mid-1);
        treeNode.right=sortedArrayToBSTHelper(numsList,mid+1,right);
        return treeNode;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode treeNode = sortedArrayToBST(new int[]{10, -3, 0, 5, 9});

    }
}
