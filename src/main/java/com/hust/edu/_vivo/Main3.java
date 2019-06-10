package com.hust.edu._vivo;

/**
 * locate com.hust.edu._vivo
 * Created by MasterTj on 2019/6/4.
 */
public class Main3 {
    public static void solution(int total, int[] arrA, int[] arrB){
        int length = arrA.length;
        int maxRes = 0;

        for (int i = 0; i < Math.pow(2, length); i++) {
            StringBuilder string = new StringBuilder(Integer.toBinaryString(i));
            while (string.length()<length){
                string.append("0");
            }
            int totalValue=0;
            int res=0;
            for (int j = 0; j < string.length(); j++) {
                if(string.charAt(j)=='1'){
                    totalValue+=arrA[j];
                    res+=arrB[j];
                }
            }
            if(totalValue<total){
                maxRes=Math.max(res,maxRes);
            }
        }
        System.out.println(maxRes);
    }

    public static void main(String[] args) {
        solution(1000,new int[]{200,600,100,180,300,450},new int[]{6,10,3,4,5,8});
    }
}
