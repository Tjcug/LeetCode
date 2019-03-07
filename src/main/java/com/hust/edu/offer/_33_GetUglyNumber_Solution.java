package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _33_GetUglyNumber_Solution {
//    public int GetUglyNumber_Solution(int index) {
//        int number=1;
//        while (index>0){
//            if(isUglyNumber(number))
//                index--;
//            number++;
//        }
//        return number-1;
//    }
//
//    private boolean isUglyNumber(int number){
//        while (number%2==0)
//            number/=2;
//        while (number%3==0)
//            number/=3;
//        while (number%5==0)
//            number/=5;
//        return number == 1;
//    }
//
//    public static void main(String[] args) {
//        _33_GetUglyNumber_Solution getUglyNumber_solution=new _33_GetUglyNumber_Solution();
//        int i = getUglyNumber_solution.GetUglyNumber_Solution(1500);
//        System.out.println(i);
//    }

    public int GetUglyNumber_Solution(int index) {
        if(index <= 0)
            return 0;
        int[] uglyNumber=new int[index];
        uglyNumber[0]=1;

        int M1=0;//2
        int M2=0;//3
        int M3=0;//5
        for (int i = 1; i < uglyNumber.length; i++) {
            int minNum=Math.min(Math.min(uglyNumber[M1]*2,uglyNumber[M2]*3),uglyNumber[M3]*5);
            uglyNumber[i]=minNum;

            if(minNum == uglyNumber[M1]*2)
                M1++;
            if(minNum == uglyNumber[M2]*3)
                M2++;
            if(minNum == uglyNumber[M3]*5)
                M3++;
        }

        return uglyNumber[index-1];
    }

    public static void main(String[] args) {
        _33_GetUglyNumber_Solution getUglyNumber_solution=new _33_GetUglyNumber_Solution();
        int i = getUglyNumber_solution.GetUglyNumber_Solution(3);
        System.out.println(i);
    }
}
