package com.hust.edu.recursion;

/**
 * locate com.hust.edu.recursion
 * Created by MasterTj on 2018/11/13.
 * LetCode 70 假设你正在爬楼梯。需要 n 阶你才能到达楼顶 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class _70_climbStairs {

    // 代码超时
//    public int climbStairs(int n) {
//        int reuslt=0;
//        Stack<Integer> stack=new Stack<>();
//        stack.push(n);
//        while (!stack.isEmpty()){
//            int top = stack.pop();
//
//            if(top==1)
//                reuslt += 1;
//            else if(top==2)
//                reuslt += 2;
//            else {
//                stack.push(top-1);
//                stack.push(top-2);
//            }
//        }
//        return reuslt;
//    }

    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int nums[]=new int[n+1];
        nums[1]=1;
        nums[2]=2;

        climbStairsHelper(n,nums);
        return nums[n];
    }

    private void climbStairsHelper(int n, int[] nums){
        int x = n-1;
        int y = n-2;
        if(x>2 && nums[x]==0){
            climbStairsHelper(x,nums);
        }

        if(y>2 && nums[y]==0){
            climbStairsHelper(y,nums);
        }
        nums[n]=nums[x]+nums[y];
    }
}
