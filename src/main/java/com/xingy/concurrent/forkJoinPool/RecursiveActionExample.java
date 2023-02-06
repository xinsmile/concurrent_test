package com.xingy.concurrent.forkJoinPool;

import java.util.concurrent.ForkJoinPool;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.forkJoinPool.RecursiveActionExample
 * @date 2019/07/30 11:56
 * @description
 */
public class RecursiveActionExample {
    public static void main(String[] args){
        ForkJoinPool forkJoinPool = new ForkJoinPool(40);
        MyRecursiveAction myRecursiveAction = new MyRecursiveAction(240);
        forkJoinPool.invoke(myRecursiveAction);
    }
}
