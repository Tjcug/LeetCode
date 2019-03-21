package com.hust.edu.list;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * locate com.hust.edu.list
 * Created by mastertj on 2019/3/20.
 * get(key): 如果cache中不存在要get的值，返回-1；如果cache中存在要找的值，返回其值并将其在原链表中删除，然后将其作为头结点。

 set(key,value)：当要set的key值已经存在，就更新其value， 将其在原链表中删除，然后将其作为头结点；当要set的key值不存在，就新建一个node，如果当前len<capacity,就将其加入hashmap中，并将其作为头结点，更新len长度，否则，删除链表最后一个node，再将其放入hashmap并作为头结点，但len不更新。
 */
public class _146_LRUCache {
    private LinkedList<Integer> linkedList=new LinkedList<>();
    private HashMap<Integer,Integer> hashMap=new HashMap<>();//<key,value>
    private int capacity=0;
    private int length=0;

    public _146_LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
         if(hashMap.containsKey(key)){
             linkedList.remove(Integer.valueOf(key));
             linkedList.addFirst(key);
             return hashMap.get(key);
         }else
             return -1;
    }

    public void put(int key, int value) {
        //判断key是否存在
        if(!hashMap.containsKey(key)){
            if(length<capacity){
                // 则添加到头结点，添加到HashMap中
                linkedList.addFirst(key);
                hashMap.put(key,value);
                length++;
            }else {
                // remove 尾部结点
                Integer integer = linkedList.removeLast();
                hashMap.remove(integer);
                linkedList.addFirst(key);
                hashMap.put(key,value);
            }
        }else {
            //key 存在
            linkedList.remove(Integer.valueOf(key));
            linkedList.addFirst(key);
            hashMap.put(key,value);
        }
    }

    public static void main(String[] args) {
        _146_LRUCache cache = new _146_LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }
}
