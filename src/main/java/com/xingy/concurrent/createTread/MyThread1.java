package com.xingy.concurrent.createTread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThread1 extends Thread{
    private final String threadName;
    private final int max;
    private final int min;
    private final Random random = new Random();

    public MyThread1(String threadName, int max, int min){
        this.threadName = threadName;
        this.max = max;
        this.min = min;
    }

    @Override
    public void run() {
        try {
            int i = random.nextInt((max - min) + 1) + min;
            Thread.sleep((long) i);
            System.out.printf("this thread name: %s, random: %s%n", threadName, i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1("t1", 20000, 10000);
//        MyThread1 myThread2 = new MyThread1("t2", 40000, 30000);
//        MyThread1 myThread3 = new MyThread1("t3", 50000, 30000);
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();


//        Thread myRunnable1 = new Thread(new MyRunnable("t4", 20000, 10000));
//        myRunnable1.start();
//        Thread myRunnable2 = new Thread(new MyRunnable("t5", 20000, 10000));
//        myRunnable2.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        MyCallable callable = new MyCallable() {
            @Override
            public String call() throws Exception {
                // 这里模拟一个耗时操作
                Thread.sleep(2000);
                return "Hello, World!";
            }
        };

        Future<String> future = executorService.submit(callable);
        try {
            // 使用Future的get()方法获取结果，如果结果还未计算完成，此方法会阻塞
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭线程池，不关闭的话，程序可能无法正常退出
            executorService.shutdown();
        }
    }
}

class MyRunnable implements Runnable{
    private String threadName;
    private int max;
    private int min;
    private final Random random = new Random();

    public MyRunnable(String threadName, int max, int min){
        this.threadName = threadName;
        this.max = max;
        this.min = min;
    }
    @Override
    public void run() {
        try {
            int i = random.nextInt((max - min) + 1) + min;
            Thread.sleep((long) i);
            System.out.printf("this thread name: %s, random: %s%n", threadName, i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {

        // 这里模拟一个耗时操作
        Thread.sleep(2000);
        return "Hello, World!";

    }
}
