package com.xingy.concurrent.syncStatic;


import java.util.concurrent.TimeUnit;

public class StaticAndSynchronized {
    public static void main(String[] args) {
        StaticAndSynchronized test1 = new StaticAndSynchronized();
        StaticAndSynchronized test2 = new StaticAndSynchronized();
        StaticAndSynchronized test3= new StaticAndSynchronized();
        StaticAndSynchronized test4= new StaticAndSynchronized();
        new Thread(()->{
            test1.task2();
        },"线程A").start();

        new Thread(()->{
            test2.task2();
        },"线程B").start();

        new Thread(()->{
            test3.task1();
        },"线程C").start();

        new Thread(()->{
            test4.task1();
        },"线程D").start();

    }

    //普通的同步
    public synchronized void task1(){
        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"：执行了Taks1...");
        }
    }

    //static 与 synchronized 联合使用
    public static void task2(){
        synchronized(StaticAndSynchronized.class){
            while(true){
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"：执行了Taks2...");
            }
        }

    }
}
