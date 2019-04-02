package com.hust.edu.depthfirst;

import java.util.List;

/**
 * locate com.hust.edu.depthfirst
 * Created by MasterTj on 2019/4/2.
 * LetCode 559 N叉树的最大深度
 * 给定一个 N 叉树，找到其最大深度。
 */
public class _599_maxDepth {

    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        List<Node> children = root.children;
        int max=0;
        for(Node node: children){
            max =Math.max(max,maxDepth(node));
        }
        return max+1;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
