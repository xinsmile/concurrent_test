package com.xingy.concurrent.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.countDownLatch.Waiter
 * @date 2019/07/30 08:08
 * @description
 */
public class Waiter implements Runnable{

    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Waiter Released");
    }
}
