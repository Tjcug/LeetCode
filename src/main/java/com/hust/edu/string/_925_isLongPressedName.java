package com.hust.edu.string;

/**
 * locate com.hust.edu.string
 * Created by mastertj on 2019/3/24.
 * 925. 长按键入
 * 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
 */
public class _925_isLongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        while (i<name.length() && j<typed.length()){
            if(name.charAt(i)!=typed.charAt(j)){
                char ch = typed.charAt(j);
                while (j<typed.length() && ch==typed.charAt(j)){
                    j++;
                }
                if(j>=typed.length() || typed.charAt(j)!=name.charAt(i)){
                    return false;
                }
            }
            i++;
            j++;
        }
        if(i==name.length())
        return true;
        else return false;
    }

    public static void main(String[] args) {
        boolean longPressedName = _925_isLongPressedName.isLongPressedName("pyplrz", "ppyypllr");
        System.out.println(longPressedName);
    }
}
