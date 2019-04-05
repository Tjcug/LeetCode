package com.hust.edu._breadthfirst;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * locate com.hust.edu._breadthfirst
 * Created by MasterTj on 2019/4/5.
 * LetCode429 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 */
public class _429_levelOrder {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resList=new ArrayList<>();
        if(root==null)
            return resList;
        Queue<Node> queue=new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                list.add(poll.val);
                for (int j = 0; j < poll.children.size(); j++) {
                    queue.add(poll.children.get(j));
                }
            }
            resList.add(list);
        }
        return resList;
    }

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
