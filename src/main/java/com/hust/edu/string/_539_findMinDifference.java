package com.hust.edu.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * locate com.hust.edu.string
 * Created by MasterTj on 2018/12/22.
 * LetCode 539 最小时间差
 */
public class _539_findMinDifference {
    public int findMinDifference(List<String> timePoints) {
        String[] string = new String[timePoints.size()];
        int[][] arr= new int[timePoints.size()][2];
        int min = Integer.MAX_VALUE;
        //对时间进行排序
        Collections.sort(timePoints, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                String[] time1 = o1.split(":");
                String[] time2 = o2.split(":");
                int t1 = Integer.parseInt(time1[0]) * 60 + Integer.parseInt(time1[1]);
                int t2 = Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]);
                return t1 - t2;
            }

        });

        for(int i = 0; i < timePoints.size() - 1; i++) {
            String[] time1 = timePoints.get(i).split(":");
            String[] time2 = timePoints.get(i + 1).split(":");
            int t1 = Integer.parseInt(time1[0]) * 60 + Integer.parseInt(time1[1]);
            int t2 = Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]);
            min = Math.min(min, t2 - t1);
        }

        String[] time1 = timePoints.get(0).split(":");
        String[] time2 = timePoints.get(timePoints.size() - 1).split(":");
        int t1 = Integer.parseInt(time1[0]) * 60 + Integer.parseInt(time1[1]);
        int t2 = Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]);

        if(min > t1 + 24 * 60 - t2)
            min = t1 + 24 * 60 - t2;
        return min;
    }
}
