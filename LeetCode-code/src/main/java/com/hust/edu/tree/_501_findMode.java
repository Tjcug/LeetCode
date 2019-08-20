package com.hust.edu.tree;

import java.util.*;

/**
 * locate com.hust.edu.tree
 * Created by mastertj on 2019/4/7.
 */
public class _501_findMode {
    private HashMap<Integer,Integer> valToSize=new HashMap<>();
    public int[] findMode(TreeNode root) {
        int[] result = new int[0];
        if(root==null)
            return result;
        findModeHelper(root);
        TreeMap<Integer,List<Integer>> sizeToVal=new TreeMap<>();
        for (Integer integer : valToSize.keySet()) {
            Integer size = valToSize.get(integer);
            if(sizeToVal.get(size)==null){
                ArrayList<Integer> arrayList=new ArrayList<>();
                arrayList.add(integer);
                sizeToVal.put(size, arrayList);
            }else {
                List<Integer> integerList = sizeToVal.get(size);
                integerList.add(integer);
            }
        }
        Set<Integer> integers = sizeToVal.keySet();
        int max=Integer.MIN_VALUE;
        for(Integer integer:integers){
            max=Math.max(integer,max);
        }

        List<Integer> integerList = sizeToVal.get(max);
        result=new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            result[i]=integerList.get(i);
        }
        return result;
    }

    private void findModeHelper(TreeNode root) {
        if(root==null)
            return;
        if(valToSize.get(root.val)==null){
            valToSize.put(root.val,1);
        }else {
            Integer integer = valToSize.get(root.val);
            valToSize.put(root.val,++integer);
        }
        findModeHelper(root.left);
        findModeHelper(root.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
