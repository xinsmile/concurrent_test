package com.xingy.concurrent.delayQueue;

import java.util.concurrent.DelayQueue;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.delayQueue.DelayQueueExample
 * @date 2019/07/29 15:30
 * @description
 */
public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement delayedElement1 = new DelayedElement(1000);
        DelayedElement delayedElement2 = new DelayedElement(0);
        DelayedElement delayedElement3 = new DelayedElement(400);
        queue.put(delayedElement1);
        queue.put(delayedElement2);
        queue.put(delayedElement3);
        DelayedElement e1 = queue.take();
        System.out.println("e1: " + e1.delayTime);
        DelayedElement e2= queue.take();
        System.out.println("e2: " + e2.delayTime);
        DelayedElement e3 = queue.take();
        System.out.println("e3: " + e3.delayTime);
    }
}
