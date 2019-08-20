package com.hust.edu.classis;

/**
 * locate com.hust.edu.classis
 * Created by mastertj on 2019/3/20.
 * 给定2D平面上的n个点，找到位于同一直线上的最大点数。
 *
 */
public class _3_maxPoints {
    public int maxPoints(Point[] points) {
        if(points.length<=2){
            return points.length;
        }
        int res=2;
        // 第一个点
        for (int i = 0; i < points.length; i++) {
            boolean[] isVisited=new boolean[points.length];
            isVisited[i]=true;
            //第二个点
            for (int j = 0; j < points.length; j++) {
                if(isVisited[j])
                    continue;
                int count=2;
                isVisited[j]=true;
                for (int k = 0; k < points.length; k++) {
                    if(isVisited[k])
                        continue;
                    if(isLine(points[i],points[j],points[k])){
                        count++;
                        res=Math.max(res,count);
                        isVisited[k]=true;
                    }
                }
            }
        }
        return res;
    }

    // 判断第三个点是否与前两个点在一条直线上
    public static boolean isLine(Point p1,Point p2,Point p3){
        if(p3.x==p1.x && p3.y==p1.y){
            return true;
        }
        if(p3.x==p2.x && p3.y==p2.y){
            return true;
        }
        if(p1.x==p2.x){
            return p3.x==p1.x;
        }

        if(p3.x==p1.x || p3.x==p2.x){
            return false;
        }

        // 为解决此问题，分子分母进行约分，化为最简形式比较
        int gcd1=gcd(p1.y-p2.y,p1.x-p2.x);
        int gcd2=gcd(p3.y-p2.y,p3.x-p2.x);
        if( (p1.y-p2.y)/gcd1 == (p3.y-p2.y)/gcd2 && (p1.x-p2.x)/gcd1 == (p3.x-p2.x)/gcd2){
            return true;
        }else{
            return false;
        }
    }

    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    private static class Point {
        int x;
        int y;
        Point() { x = 0; y = 0; }
        Point(int a, int b) { x = a; y = b; }
    }
}
