package com.hust.edu.search;

/**
 * locate com.hust.edu.search
 * Created by MasterTj on 2019/4/7.
 * 744. 寻找比目标字母大的最小字母
 * 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 *
 * 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
 */
public class _744_nextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int hgih=letters.length;
        while (low<hgih){
            int mid=(low+hgih)/2;
            if(letters[mid]<=target){
                low = mid+1;
            }else{
                hgih = mid;
            }
        }
        return letters[low%letters.length];
    }

    public static void main(String[] args) {
        char a = _744_nextGreatestLetter.nextGreatestLetter(new char[]{'a', 'b'}, 'z');
        System.out.println(a);
    }

}
