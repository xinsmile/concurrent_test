package com.xingy.concurrent.concurrentHashMap;

import java.util.Map;
import java.util.Set;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.concurrentHashMap.Thread1
 * @date 2019/07/29 23:02
 * @description
 */
public class Thread2 extends Thread {

    private final Map map;

    Thread2(Map map) {
        this.map = map;
    }

    @Override
    public void run() {
        super.run();
        Set set = map.keySet();
        for(Object next : set) {
            System.out.println(next + ":" + map.get(next));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
