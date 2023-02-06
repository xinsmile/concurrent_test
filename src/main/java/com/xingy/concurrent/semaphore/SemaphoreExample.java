package com.xingy.concurrent.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.semaphore.SemaphoreExample
 * @date 2019/07/30 10:06
 * @description
 */
public class SemaphoreExample {
    public static void main(String[] args){
        Semaphore semaphore = new Semaphore(3);

        new Thread(new ThreadSemaphore(semaphore)).start();
        new Thread(new ThreadSemaphore(semaphore)).start();
        new Thread(new ThreadSemaphore(semaphore)).start();
        new Thread(new ThreadSemaphore(semaphore)).start();
        new Thread(new ThreadSemaphore(semaphore)).start();

    }
}
