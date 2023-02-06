package com.xingy.concurrent.concurrentHashMap;

import java.util.Map;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.concurrentHashMap.Thread1
 * @date 2019/07/29 23:02
 * @description
 */
public class Thread1 extends Thread {

    private final Map map;

    Thread1(Map map) {
        this.map = map;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.remove("6");
    }
}
