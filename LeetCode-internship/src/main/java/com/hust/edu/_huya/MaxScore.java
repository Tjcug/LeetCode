package com.hust.edu._huya;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * locate com.hust.edu._huya
 * Created by MasterTj on 2019/5/8.
 */
public class MaxScore {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()) {//不能用true
            ArrayList<Integer> students=new ArrayList<>();
            students.add(-1);
            int N=in.nextInt();
            int M=in.nextInt();
            for (int i = 0; i < N; i++) {
                students.add(in.nextInt());
            }
            for (int i = 0; i < M; i++) {
                switch (in.next()) {
                    case "Q":
                        int n1=in.nextInt();
                        int n2=in.nextInt();
                        System.out.println(max(n1,n2,students));
                        break;
                    case "U":
                        students.set(in.nextInt(),in.nextInt());
                        break;
                }
            }
        }
    }

    /**
     * 从成绩数组中从start到end的最大值
     *
     * @param start
     * @param end
     * @return
     */
    public static int max(int start, int end, ArrayList<Integer> scores) {
        if (start > end)
            return max(end, start, scores);
        else {
            int max = scores.get(start);
            for (int i = start + 1; i <= end; i++) {
                if (scores.get(i) > max)
                    max = scores.get(i);
            }
            return max;
        }

    }
}
