package com.hust.edu.search;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/4/5.
 */
public class _374_guessNumber {
    public int guessNumber(int n) {
        if(n==1 || n==0)
            return n;
        long low=1;
        long high=n;
        while (low<high){
            long mid=(low+high)/2;
            if(guess((int) mid)==0)return (int) mid;
            else if(guess((int) mid)==1)
                low=mid+1;
            else if(guess((int) mid)==-1)high=mid-1;
        }
        return (int) low;
    }

    private int guess(int num){
        return -1;
    }
}
