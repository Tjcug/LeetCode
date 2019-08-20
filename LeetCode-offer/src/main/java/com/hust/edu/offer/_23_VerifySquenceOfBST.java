package com.hust.edu.offer;

import java.util.Arrays;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/5.
 * 二叉搜索树的后续遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class _23_VerifySquenceOfBST {
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence==null||sequence.length==0)
            return false;
        int root=sequence[sequence.length-1];
        int low=0;
        for (low = 0; low < sequence.length-1; low++) {
            if(sequence[low]>root)
                break;
        }
        for (int i =low; i < sequence.length-1; i++) {
            if(sequence[i]<root)
                return false;
        }
        boolean left = true;
        if(low>0){
            left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, low));
        }
        boolean right = true;
        if(low<sequence.length-1){
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, low, sequence.length-1));
        }
        return left&right;
    }

    public static void main(String[] args) {
        int [] seq = {2,9,5,15,19,10,12};
        System.out.println(new _23_VerifySquenceOfBST().VerifySquenceOfBST(seq));
    }
}
