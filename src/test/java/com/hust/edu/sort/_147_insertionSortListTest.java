package com.hust.edu.sort;

import org.junit.Test;

/**
 * locate com.hust.edu.sort
 * Created by MasterTj on 2018/12/10.
 */
public class _147_insertionSortListTest {
    @Test
    public void insertionSortList() throws Exception {
        _147_insertionSortList insertionSortList=new _147_insertionSortList();
        _147_insertionSortList.ListNode listNode=new _147_insertionSortList.ListNode(-1);
        listNode.next=new _147_insertionSortList.ListNode(0);
        insertionSortList.insertionSortList(listNode);
    }

}
