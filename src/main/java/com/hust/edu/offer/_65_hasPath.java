package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by mastertj on 2019/3/12.
 * 回溯法
 */
public class _65_hasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if(matrix==null || rows<1 || cols<1 || str==null)
            return false;
        boolean[][] visited=new boolean[rows][cols];
        int pahtLength=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(hasPathHelper(matrix,rows,cols,i,j,str,pahtLength,visited))
                    return true;
            }
        }
        return false;
    }

    private boolean hasPathHelper(char[] matrix, int rows, int cols, int row, int col , char[] str, int pathLength ,boolean[][] visited){
        if(pathLength==str.length)
            return true;

        boolean hasPath=false;
        if(row>=0 && row<rows && col>=0 && col<cols && matrix[row*cols+col]==str[pathLength] && !visited[row][col]){
            ++pathLength;
            visited[row][col]=true;
            hasPath= hasPathHelper(matrix,rows,cols,row,col-1,str,pathLength,visited)||
                    hasPathHelper(matrix,rows,cols,row+1,col,str,pathLength,visited)||
                    hasPathHelper(matrix,rows,cols,row-1,col,str,pathLength,visited)||
                    hasPathHelper(matrix,rows,cols,row,col+1,str,pathLength,visited);
            if(!hasPath){
                --pathLength;
                visited[row][col]=false;
            }
        }
        return hasPath;
    }

    public static void main(String[] args) {
        _65_hasPath hasPath=new _65_hasPath();
        boolean b = hasPath.hasPath("ABCESFCSADEE".toCharArray(), 3, 4, "SEE".toCharArray());
        System.out.println(b);
    }
}
