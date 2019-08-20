package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/11.
 */
public class _61_Serialize {
    public int index = -1;  // 节点在序列中的索引

    /**
     * 序列化
     * 前序遍历，将二叉树节点的值转为字符序列，null转为“#”
     *
     * @param root
     * @return
     */
    String Serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        if(root==null){
            sb.append("#,");
        }
        sb.append(root.val+",");
        Serialize(root.left);
        Serialize(root.right);
        return sb.toString();
    }

    /**
     * 反序列化
     *
     * @param str
     * @return
     */
    TreeNode Deserialize(String str) {
        index++;
        if(index<str.length()){
            String[] split = str.split(",");
            TreeNode treeNode=null;
            if(!split[index].equals("#")){
                treeNode=new TreeNode(Integer.valueOf(split[index]));
                treeNode.left=Deserialize(str);
                treeNode.right=Deserialize(str);
            }
            return treeNode;
        }
        return null;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
