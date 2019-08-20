package com.hust.edu.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/8.
 * 590. N叉树的后序遍历
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 */
public class _590_postorder {
    private List<Integer> list=new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if(root==null) return list;
        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i));
        }
        list.add(root.val);
        return list;
    }

    private class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
