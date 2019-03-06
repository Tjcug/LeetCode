package com.hust.edu.offer;

import java.util.Arrays;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _45_isContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length==0)
            return false;

        Arrays.sort(numbers);
        int numbesOfZero=0;
        for (int i = 0; i < numbers.length && numbers[i]==0; i++) {
            numbesOfZero++;
        }

        for (int i = numbesOfZero; i < numbers.length-1; i++) {
            if(numbers[i+1]!=numbers[i]+1){
                if(numbesOfZero>0 && numbers[i+1]-numbers[i] -1<=numbesOfZero && numbers[i+1]-numbers[i] -1>0) {
                    numbesOfZero-=numbers[i+1]-numbers[i]-1;
                }else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _45_isContinuous isContinuous=new _45_isContinuous();
        boolean continuous = isContinuous.isContinuous(new int[]{0, 3, 2, 6, 4});
        System.out.println(continuous);
    }
}
