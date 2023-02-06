package com.xingy.concurrent.forkJoinPool;

import java.util.concurrent.ForkJoinPool;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.forkJoinPool.RecursiveTaskExample
 * @date 2019/07/30 14:29
 * @description
 */
public class RecursiveTaskExample {
    public static void main(String[] args){
        ForkJoinPool forkJoinPool = new ForkJoinPool(40);
        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(240);
        Object invoke = forkJoinPool.invoke(myRecursiveTask);
        System.out.println("result: " + invoke);
    }
}
