package com.hust.edu.list;

import org.junit.Test;

/**
 * locate com.hust.com.hust.edu.list
 * Created by MasterTj on 2018/12/7.
 */
public class _61_rotateRightTest {
    @Test
    public void rotateRight() throws Exception {
        _61_rotateRight rotateRight=new _61_rotateRight();
        _61_rotateRight.ListNode head=new _61_rotateRight.ListNode(1);
        _61_rotateRight.ListNode temp=head;
        for (int i = 2; i <= 5; i++) {
            temp.next=new _61_rotateRight.ListNode(i);
            temp=temp.next;
        }
        _61_rotateRight.ListNode listNode = rotateRight.rotateRight(head, 2);
    }

}
