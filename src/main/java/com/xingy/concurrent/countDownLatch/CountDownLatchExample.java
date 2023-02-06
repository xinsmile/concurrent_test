package com.xingy.concurrent.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.countDownLatch.CountDownLatchExample
 * @date 2019/07/30 08:11
 * @description
 */
public class CountDownLatchExample {
    public static void main(String[] args){
        CountDownLatch latch = new CountDownLatch(3);

        Waiter waiter = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);

        new Thread(waiter).start();
        new Thread(decrementer).start();
    }
}
