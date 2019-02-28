package com.hust.edu.offer;

/**
 * locate com.hust.edu.offer
 * Created by MasterTj on 2019/2/28.
 */
public class _2_replaceSpace {
    public String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}
