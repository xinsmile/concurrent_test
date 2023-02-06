package com.xingy.concurrent.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.blockingqueue.Producer
 * @date 2019/07/29 13:37
 * @description 生产者
 */
public class Producer implements Runnable {

    private BlockingQueue<String> queue = null;

    Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
