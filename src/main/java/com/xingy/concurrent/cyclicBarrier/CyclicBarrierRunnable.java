package com.xingy.concurrent.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.cyclicBarrier.CyclicBarrierRunnable
 * @date 2019/07/30 08:29
 * @description
 */
public class CyclicBarrierRunnable implements Runnable {

    CyclicBarrier barrier1;
    CyclicBarrier barrier2;

    public CyclicBarrierRunnable(CyclicBarrier barrier1, CyclicBarrier barrier2) {
        this.barrier1 = barrier1;
        this.barrier2 = barrier2;
    }

    @Override
    public void run() {
        try {

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()
                + "waiting at barrier 1");
            this.barrier1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()
                    + "waiting at barrier 2");
            this.barrier2.await();
            System.out.println(Thread.currentThread().getName()
                    + "Done");


        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
