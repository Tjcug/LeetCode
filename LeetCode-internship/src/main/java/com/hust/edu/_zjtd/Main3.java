package com.hust.edu._zjtd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * locate com.hust.edu._zjtd
 * Created by MasterTj on 2019/3/16.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N=in.nextInt();
            int result[]=new int[N];
            for (int i = 0; i < N; i++) {
                int n=in.nextInt();
                int[] array=new int[n];
                int[] value=new int[n];
                for (int j = 0; j < n; j++) {
                    value[j]=1;
                }
                for (int j = 0; j < n; j++) {
                    array[j]=in.nextInt();
                }
                findMinValue(array,value);
                int sum=0;
                for (int j = 0; j < n; j++) {
                    sum+=value[j];
                }
                result[i]=sum;
            }

            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }

    public static void findMinValue(int[] array,int[] value){
        int i=0;
        int size=array.length;
        Model[] models=new Model[array.length];
        for (int j = 0; j < array.length; j++) {
            models[j]=new Model(array[j],j);
        }
        Arrays.sort(models, new Comparator<Model>() {
            @Override
            public int compare(Model o1, Model o2) {
                return o1.val-o2.val;
            }
        });

        while (i<models.length) {
            int index = models[i].indxe;
            computeVaule(index,array,value,size);
            i++;
        }
    }

    private static void computeVaule(int index,int[] array,int []values,int size){
        int left= getLeft(index,size);
        int right= getRight(index,size);
        int maxVaule = Math.max(values[left], values[right]);
        if(array[index]>maxVaule){
            values[index]=maxVaule+1;
        }else if(array[index]>array[left]){
            values[index]=values[left]+1;
        }else if(array[index]>array[right])
            values[index]=values[right]+1;

    }

    public static int getLeft(int index ,int size){
        return (index-1 +size)%size;
    }

    public static int getRight(int index,int size){
        return (index+1)%size;
    }

    public static class Model{
        int val;
        int indxe;

        public Model(int val, int indxe) {
            this.val = val;
            this.indxe = indxe;
        }
    }
}
