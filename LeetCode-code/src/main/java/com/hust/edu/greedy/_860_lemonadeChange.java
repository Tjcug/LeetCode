package com.hust.edu.greedy;

/**
 * locate com.hust.edu.greedy
 * Created by MasterTj on 2019/4/5.
 */
public class _860_lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int n5=0,n10=0,n20=0;
        for (int i = 0; i < bills.length; i++) {
            int bill = bills[i];
            if(bill==5) n5++;
            else if(bill==10){
                n10++;
                n5--;
                if(n5<0)
                    return false;
            }else if(bill==20){
                n20++;
                if(n10>=1){
                    n10-=1;
                    n5--;
                    if(n5<0)
                        return false;
                }else{
                    n5-=3;
                    if(n5<0)
                        return false;
                }
            }
        }
        return true;
    }
}
