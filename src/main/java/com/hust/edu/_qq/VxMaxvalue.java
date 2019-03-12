package com.hust.edu._qq;

/**
 * locate com.hust.edu._qq
 * Created by mastertj on 2019/3/12.
 */
public class VxMaxvalue {
    public int MaxVaule(int m, int[] veclnit){

        int length = veclnit.length;
        int n1=0;
        while (m>0 && n1+m<length){
            int n2=n1+m;
            int max=Integer.MIN_VALUE;
            int temp=0;
            for (int i = n1; i < n2; i++) {
                if(veclnit[i]>0){
                    max=veclnit[i];
                    temp=i+1;
                    break;
                }
                if(veclnit[i]>max){
                    max=veclnit[i];
                    temp=i+1;
                }
            }
            m+=max;
            n1=temp;
        }
        if(m<=0)
            return -1;
        return m;
    }

    public static void main(String[] args) {
        VxMaxvalue vxMaxvalue=new VxMaxvalue();
        int i = vxMaxvalue.MaxVaule(2, new int[]{-1, 5, -5, -4, -6});
        System.out.println(i);
    }
}
