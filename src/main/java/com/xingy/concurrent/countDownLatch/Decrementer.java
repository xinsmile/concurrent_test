package com.xingy.concurrent.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.countDownLatch.Decrementer
 * @date 2019/07/30 08:10
 * @description
 */
public class Decrementer implements Runnable {

    CountDownLatch latch = null;

    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("1");

            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("2");

            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("3");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
