package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 */
public class _35_InversePairs {
//    public int InversePairs(int [] array) {
//        int result=0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if(array[j]<array[i])
//                    result++;
//            }
//        }
//        return result;
//    }

    public int InversePairs(int [] array) {
        int[] copy=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
        return InversePairsHelper(array,copy,0,array.length-1);
    }

    private int InversePairsHelper(int [] array,int [] copy, int start ,int end) {
        if(start==end){
            copy[start]=array[start];
            return 0;
        }
        int length=(end-start)/2;
        int left=InversePairsHelper(copy,array,start,start+length);
        int right=InversePairsHelper(copy,array,start+length+1,end);

        int i=start+length;
        int j=end;
        int indexCopy=end;
        int count=0;
        while (i>= start && j>=start+length+1){
            if(array[i]>array[j]){
                copy[indexCopy--]=array[i--];
                count+=j-start-length;
            }else {
                copy[indexCopy--]=array[j--];
            }
        }

        while (i>=start){
            copy[indexCopy--]=array[i--];
        }

        while (j>=start+length+1){
            copy[indexCopy--]=array[j--];
        }
        return (left+right+count)%1000000007;
    }

    public static void main(String[] args) {
        _35_InversePairs inversePairs=new _35_InversePairs();
        int i = inversePairs.InversePairs(new int[]{1,2,3,4,5,6,7,0});
        System.out.println(i);
    }
}
