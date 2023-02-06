package com.xingy.concurrent.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.blockingqueue.Consumer
 * @date 2019/07/29 13:43
 * @description 消费者
 */
public class Consumer implements Runnable {

    private BlockingQueue queue = null;

    Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
