package com.xingy.concurrent.cyclicBarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.cyclicBarrier.CyclicBarrierExample
 * @date 2019/07/30 08:34
 * @description
 */
public class CyclicBarrierExample {
    public static void main(String[] args){
        Runnable barrier1Action = () -> {
            System.out.println("BarrierAction 1 executed ");
        };

        Runnable barrier2Action= () -> {
            System.out.println("BarrierAction 2 executed ");
        };

        CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
        CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);

        CyclicBarrierRunnable cyclicBarrierRunnable =
                new CyclicBarrierRunnable(barrier1, barrier2);

        new Thread(cyclicBarrierRunnable).start();
        new Thread(cyclicBarrierRunnable).start();
        List<String> list = new ArrayList<>();

    }
}
