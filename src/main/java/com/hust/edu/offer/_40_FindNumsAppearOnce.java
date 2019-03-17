package com.hust.edu.offer;

import java.util.HashMap;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/3/6.
 * 数组中只出现一次的数字
 */
public class _40_FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.get(array[i])==null){
                map.put(array[i],1);
            }else{
                Integer integer = map.get(array[i]);
                map.put(array[i],++integer);
            }
        }
        boolean m_bool=true;
        for(Integer integer:map.keySet()){
            if(map.get(integer)==1){
                if(m_bool){
                    num1[0]=integer;
                    m_bool=false;
                }else {
                    num1[2]=integer;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        _40_FindNumsAppearOnce findNumsAppearOnce=new _40_FindNumsAppearOnce();
        int num1[] =new int[1];
        int num2[] =new int[1];
        findNumsAppearOnce.FindNumsAppearOnce(new int[]{2,4,3,6,3,2,5,5},num1,num2);
        System.out.println(num1[0]+" "+num2[0]);
    }
}
