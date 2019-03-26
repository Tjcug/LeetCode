package com.hust.edu._ant;

/**
 * locate com.hust.edu._ant
 * Created by MasterTj on 2019/3/25.
 * 给定一个排序好的数组和一个数，打印数组中连续元素的和等于所给数的子数组。请给出O(n)时间复杂度的解法。
 */
public class findNum {
    public void find(int[] numbers, int targetNum) {
        int start=0,sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
            while (sum>targetNum){
                sum-=numbers[start];
                start++;
            }
            if(sum==targetNum){
                printSum(numbers,start,i);
                sum-=numbers[start];
                start++;
            }
        }

    }

    private void printSum(int[] numbers,int start, int i) {
        for (int j = start; j <=i ; j++) {
            System.out.print(numbers[j]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        findNum findNum=new findNum();
        findNum.find(new int[]{1,1,2,6,8,8,9,10},16);
    }
}
