package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 给定一组字符，使用原地算法将其压缩
 * 压缩后的长度必须始终小于或等于原数组长度。
 */
public class _443_compress {
    public static int compress(char[] chars) {
        int count=1;
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            if(chars[i]==chars[i+1]){
                count++;
            }else {
                if(count==1){
                    stringBuilder.append(chars[i]);
                }else {
                    stringBuilder.append(chars[i]);
                    stringBuilder.append(count);
                }
                count = 1;
            }
        }

        if(count==1){
            stringBuilder.append(chars[chars.length-1]);
        }else {
            stringBuilder.append(chars[chars.length-1]);
            stringBuilder.append(count);
        }

        char[] temp = stringBuilder.toString().toCharArray();
        for (int i = 0; i < temp.length; i++) {
            chars[i]=temp[i];
        }
        return temp.length;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int compress = _443_compress.compress(chars);
        System.out.println(compress);
    }
}
