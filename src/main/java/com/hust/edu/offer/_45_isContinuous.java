package com.hust.edu.offer;

import java.util.Arrays;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 扑克牌顺子
 */
public class _45_isContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length==0)
            return false;

        Arrays.sort(numbers);
        int numbesOfZero=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==0)
                numbesOfZero++;
        }

        int low=numbesOfZero;
        int high=low+1;
        int numbersGap=0;
        while (high<numbers.length){
            if(numbers[low]==numbers[high])
                return false;
            numbersGap+=numbers[high]-numbers[low]-1;
            low++;
            high++;
        }
        return numbersGap<=numbesOfZero? true:false;
    }

    public static void main(String[] args) {
        _45_isContinuous isContinuous=new _45_isContinuous();
        boolean continuous = isContinuous.isContinuous(new int[]{0, 3, 2, 6, 4});
        System.out.println(continuous);
    }
}
