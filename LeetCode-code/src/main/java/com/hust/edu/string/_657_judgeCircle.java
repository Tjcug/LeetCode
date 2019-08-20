package com.hust.edu.string;

/**
 * locate com.hust.com.hust.edu.string
 * Created by MasterTj on 2019/3/24.
 * 657. 机器人能否返回原点
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 */
public class _657_judgeCircle {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if(c=='U')
                y++;
            else if(c=='D')
                y--;
            else if(c=='L')
                x--;
            else if(c=='R')
                x++;
        }
        return x==0 && y==0;
    }
}
