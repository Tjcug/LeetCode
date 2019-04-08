package com.hust.edu.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.tree
 * Created by MasterTj on 2019/4/8.
 */
public class _589_preorder {
    private List<Integer> list=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null) return list;
        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }
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
