package com.hust.edu.graph;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * locate com.hust.edu.graph
 * Created by MasterTj on 2018/11/5.
 * 785 二分图的判断方法。
 */
public class _785_isBipartite {

    //0为白色 1为黑色
    public boolean isBipartite(int[][] graph) {
        int[] colors=new int[graph.length];
        for (int j = 0; j < colors.length; j++) {
            colors[j]=-1;
        }

        for(int i=0; i< graph.length;i++){
            if(colors[i]==-1){
                if(!bfs(graph,colors,0,i)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bfs(int [][]graph , int[] colors, int color ,int node){
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(node);
        colors[node]=color;

        while (!queue.isEmpty()){
            int front = queue.poll();
            int c = colors[front];
            for(int next : graph[front]){
                if(colors[next]==-1){
                    //没有被染色过
                    colors[next]= 1 - c;
                    queue.add(next);
                }else {
                    //已经被染色 如果有相同颜色表示染色失败返回false
                    if(colors[next] != 1 - c){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
