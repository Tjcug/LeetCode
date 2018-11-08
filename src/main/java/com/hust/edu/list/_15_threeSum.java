package com.hust.edu.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * locate com.hust.edu.list
 * Created by MasterTj on 2018/11/8.
 * LetCode 15 三数之和
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 */
public class _15_threeSum {
//    时间复杂度太高 需要一种时间复杂度较低的解法。
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> positive = new ArrayList(), negative = new ArrayList(), zero = new ArrayList();
//        for (int num : nums) {
//            if (num > 0) {
//                positive.add(num);
//            } else if (num < 0) {
//                negative.add(num);
//            } else
//                zero.add(num);
//        }
//
//        //zero zero zero
//        if(zero.size()>=3){
//            lists.add(Arrays.asList(0,0,0));
//        }
//
//        if (positive.size() == 0 || negative.size() == 0)
//            return lists;
//
//        // positive negative zero
//        if (zero.size() != 0) {
//            int temp = 0;
//            for (int num : positive) {
//                if (num == temp)
//                    continue;
//                if (negative.indexOf(-num) >= 0) {
//                    temp = num;
//                    lists.add(Arrays.asList(-num, 0, num));
//                }
//            }
//        }
//
//        // positive positive negative
//        int first = 0, second = 0;
//        for (int i = 0; i < positive.size(); i++) {
//            for (int j = i + 1; j < positive.size(); j++) {
//                if (positive.get(i) == first && positive.get(j) == second) {
//                    continue;
//                }
//                if (negative.indexOf(-(positive.get(i) + positive.get(j))) >= 0) {
//                    first = positive.get(i);
//                    second = positive.get(j);
//                    lists.add(Arrays.asList(first, second, -(first + second)));
//                }
//            }
//        }
//
//        //negative negative positive
//        first=0;
//        second=0;
//        for (int i = 0; i < negative.size(); i++) {
//            for (int j = i + 1; j < negative.size(); j++) {
//                if (negative.get(i) == first && negative.get(j) == second) {
//                    continue;
//                }
//                if (positive.indexOf(-(negative.get(i) + negative.get(j))) >= 0) {
//                    first = negative.get(i);
//                    second = negative.get(j);
//                    lists.add(Arrays.asList(first, second, -(first + second)));
//                }
//            }
//        }
//
//        return removeDuplicate(lists);
//    }
//
//    private static List removeDuplicate(List list) {
//        HashSet h = new HashSet(list);
//        list.clear();
//        list.addAll(h);
//        return list;
//    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = nums.length - 1;
            int target = 0 - nums[i];
            int k = i + 1;
            while (k < j) {
                if (nums[k] + nums[j] == target) {
                    List<Integer> item = Arrays.asList(nums[i], nums[k], nums[j]);
                    result.add(item);
                    while (k < j && nums[k] == nums[k + 1]) k++;
                    while (k < j && nums[j] == nums[j - 1]) j--;
                    k++;j--;
                } else if (nums[k] + nums[j] < target) {
                    k++;
                } else {
                    j--;
                }
            }
        }
        return result;
    }
}
