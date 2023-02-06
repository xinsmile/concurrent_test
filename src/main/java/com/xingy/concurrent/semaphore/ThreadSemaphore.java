package com.xingy.concurrent.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.semaphore.ThreadSemaphore
 * @date 2019/07/30 09:54
 * @description
 */
public class ThreadSemaphore implements Runnable {

    private final Semaphore semaphore;

    public ThreadSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "获取到锁进来");
            System.out.println("timestamp:" + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }
}
