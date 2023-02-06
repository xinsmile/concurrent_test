package com.xingy.concurrent.priorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.priorityBlockingQueue.PriorityBlockingQueueExample
 * @date 2019/07/29 16:25
 * @description
 */
public class PriorityBlockingQueueExample {
    public static void main(String[] args){
        PriorityBlockingQueue<User> queue = new PriorityBlockingQueue<>();
        queue.add(new User(1,"wu1"));
        queue.add(new User(23,"wu23"));
        queue.add(new User(10,"wu10"));
        queue.add(new User(5,"wu5"));
        queue.add(new User(7,"wu7"));
        try {
            for (User user : queue) {
                System.out.println(queue.take().name);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
