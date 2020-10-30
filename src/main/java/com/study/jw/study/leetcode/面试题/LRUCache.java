package com.study.jw.study.leetcode.面试题;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jww on 2020/10/29.
 * Describe
 */
public class LRUCache extends LinkedHashMap<Integer,Integer> {
    private int capacity;
    public LRUCache(int capacity) {
        //初始化容量、扩容值、
        super(capacity,0.75F,true);
        this.capacity=capacity;
    }

    public int get(int key) {

        return super.getOrDefault(key,-1);
    }

    public Integer put(int key, int value) {
        return super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }


}
