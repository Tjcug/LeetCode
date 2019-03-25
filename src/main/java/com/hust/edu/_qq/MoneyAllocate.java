package com.hust.edu._qq;

/**
 * locate com.hust.edu._qq
 * Created by MasterTj on 2019/3/25.
 * 现在有1,3,5,7四种面值的纸币，把它们分成每组21的堆，问最少分多少堆
 * 就是这些纸币能分多少个21出来 最后不满足21单独当做1堆
 */
public class MoneyAllocate {
    public static void main(String[] args) {
        MoneyAllocate moneyAllocate=new MoneyAllocate();
        moneyAllocate.findMinAllocate21(new int[]{5,7,6,9});
    }
    private int count=0;

    public int findMinAllocate21(int nums[]){
        findMinAllocate21Helper(nums,21);
        System.out.println(count);
        return count;
    }

    private void findMinAllocate21Helper(int[]nums , int target){
        if(target==0) {
            count++;
            findMinAllocate21Helper(nums,21);
        }else if((nums[0]+nums[1]*3+nums[2]*5+nums[3]*7)>=21) {
            if (target >= 7 && nums[3]>0) {
                int i = target / 7;
                if (i >= nums[3]) {
                    target -= nums[3] * 7;
                    nums[3] = 0;
                } else {
                    target -= i * 7;
                    nums[3] -= i;
                }
                findMinAllocate21Helper(nums, target);
            }else if(target >= 5 && nums[2]>0){
                int i = target / 5;
                if (i >= nums[2]) {
                    target -= nums[2] * 5;
                    nums[2] = 0;
                } else {
                    target -= i * 5;
                    nums[2] -= i;
                }
                findMinAllocate21Helper(nums, target);
            }else if(target>=3 && nums[1]>0){
                int i = target / 3;
                if (i >= nums[1]) {
                    target -= nums[1] * 3;
                    nums[1] = 0;
                } else {
                    target -= i * 3;
                    nums[1] -= i;
                }
                findMinAllocate21Helper(nums, target);
            }else if(target>=1 && nums[0]>0){
                int i = target;
                if (i >= nums[0]) {
                    target -= nums[0];
                    nums[0] = 0;
                } else {
                    target -= i;
                    nums[0] -= i;
                }
                findMinAllocate21Helper(nums, target);
            }
        }else if(nums[0]!=0 || nums[1]!=0 || nums[2]!=0 || nums[3]!=0){
            count++;
            return;
        }
    }
}
