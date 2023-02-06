package com.xingy.concurrent.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.concurrentHashMap.ConcurrentHashMapExample
 * @date 2019/07/29 23:00
 * @description
 */
public class ConcurrentHashMapExample {
    public static void main(String[] args){
        // Map map = new HashMap();
        // Map map = Collections.synchronizedMap(new HashMap());
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");
        new Thread1(map).start();
        new Thread2(map).start();

    }
}
