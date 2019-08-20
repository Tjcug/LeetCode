package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * LetCode 551 给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 */
public class _551_checkRecord {
    public static boolean checkRecord(String s) {
        int countAbsent=0;
        int continusLate=0;
        for (int i = 0; i < s.length(); i++) {
            while (i<s.length() && s.charAt(i)=='L'){
                continusLate++;
                i++;
                if(continusLate>2)
                    return false;
            }
            continusLate=0;
            if(i<s.length() && s.charAt(i)=='A')
                countAbsent++;
        }
        return countAbsent<=1;
    }

    public static void main(String[] args) {
        boolean aaa = _551_checkRecord.checkRecord("PPALLP");
        System.out.println(aaa);
    }
}
