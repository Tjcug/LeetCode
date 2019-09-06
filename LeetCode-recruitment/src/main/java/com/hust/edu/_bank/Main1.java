package com.hust.edu._bank;

import java.util.*;

/**
 * locate com.hust.edu._bank
 * Created by MasterTj on 2019/9/6.
 */
public class Main1 {

    public static List<String> list = new LinkedList<>();
    public static List<Integer> sizeList = new LinkedList<>();

    static {
        list.addAll(Arrays.asList("AA","AB","AC","BA","BB","BC","CA","CB"));
        sizeList.add(0);
        sizeList.add(0);
        sizeList.add(1);
        sizeList.add(0);
        sizeList.add(0);
        sizeList.add(1);
        sizeList.add(1);
        sizeList.add(1);
    }

    public static void getAvaliableCount(int month){
        if(month==2)
            return;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = list.get(0);
            Integer sizeC = sizeList.get(0);
            list.add("A"+str);
            sizeList.add(sizeC);

            list.add(str+"A");
            sizeList.add(sizeC);

            if(!isFront(str)){
                list.add("B"+str);
                sizeList.add(sizeC);
            }else if(!isBehind(str)) {
                sizeList.add(sizeC);
                list.add(str + "B");
            }

            if(sizeC==0){
                list.add("C"+str);
                sizeList.add(sizeC+1);

                list.add(str+"C");
                sizeList.add(sizeC+1);
            }
            sizeList.remove(0);
            list.remove(0);
        }
        getAvaliableCount(--month);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nextInt = sc.nextInt();
        if(nextInt==1){
            System.out.println(3);
            return;
        }
        getAvaliableCount(nextInt);
        Set set =new HashSet(list);
        System.out.println(set);
    }

    public static boolean isFront(String str){
        return str.charAt(0)=='B' && str.charAt(1)=='B';
    }

    public static boolean isBehind(String str){
        return str.charAt(str.length()-1)=='B' && str.charAt(str.length()-2)=='B';
    }
}
