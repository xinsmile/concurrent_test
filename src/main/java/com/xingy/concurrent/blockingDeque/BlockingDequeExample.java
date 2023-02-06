package com.xingy.concurrent.blockingDeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.blockingDeque.BlockingDequeExample
 * @date 2019/07/29 17:48
 * @description
 */
public class BlockingDequeExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> deque = new LinkedBlockingDeque<String>();
        deque.addFirst("1");
        deque.addLast("2");
        String two = deque.takeLast();
        String one = deque.takeFirst();
        System.out.println(two);
        System.out.println(one);
    }
}
