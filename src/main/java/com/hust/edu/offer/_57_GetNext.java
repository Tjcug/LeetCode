package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 */
public class _57_GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null)return null;
        //如果pNode的right!=null
        if(pNode.right!=null){
            pNode=pNode.right;
            while (pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }
        //如果pNode的right=null
        while (pNode.next!=null){
            TreeLinkNode parent = pNode.next;
            if(parent.left==pNode){
                return parent;
            }
            pNode=pNode.next;
        }
        return null;
    }

    private class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}
