package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 * 二叉树的下一个节点
 */
public class _57_GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
       if(pNode==null)
           return null;
       if(pNode.right!=null){
           //右子树不为null
           TreeLinkNode right = pNode.right;
           while (right.left!=null){
               right=right.left;
           }
           return right;
       }else if(pNode.next!=null){
           //右子树为null需要往根节点遍历
           TreeLinkNode current=pNode;
           TreeLinkNode parrent=pNode.next;
           while (parrent!=null && parrent.right==current){
               current=parrent;
               parrent=current.next;
           }
           return parrent;
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
