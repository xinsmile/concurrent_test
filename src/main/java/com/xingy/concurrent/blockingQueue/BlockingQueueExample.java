package com.xingy.concurrent.blockingQueue;

import java.util.concurrent.*;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.blockingqueue.BlockingQueueExample
 * @date 2019/07/29 14:55
 * @description
 */
public class BlockingQueueExample {
    public static void main(String[] args){
        //BlockingQueue FIFO 先进先出
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();

        // LinkedBlockingQueue FIFO 先进先出
        // java 的transient关键字为我们提供了便利，你只需要实现Serilizable接口，
        // 将不需要序列化的属性前添加关键字transient，序列化对象的时候，这个属性就不会序列化到指定的目的地中。
        BlockingQueue<String> linkQueue = new LinkedBlockingDeque<>();
        Producer producer1 = new Producer(linkQueue);
        Consumer consumer1 = new Consumer(linkQueue);
        new Thread(producer1).start();
        new Thread(consumer1).start();

        PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
        Producer producer2 = new Producer(priorityBlockingQueue);
        Consumer consumer2 = new Consumer(priorityBlockingQueue);
        new Thread(producer2).start();
        new Thread(consumer2).start();

        //SynchronousQueue
        // 使用方法和 ArrayBlockingQueue 一样吧，区别就是 SynchronousQueue 只能保存一个元素。
        // new ArrayBlockingQueue<>(1)

        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();
        Producer producer3 = new Producer(synchronousQueue);
        Consumer consumer3 = new Consumer(synchronousQueue);
        new Thread(producer3).start();
        new Thread(consumer3).start();

    }
}
