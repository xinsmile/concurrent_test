package com.xingy.concurrent.executorService;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.executorService.ExecutorServiceExample
 * @date 2019/07/30 10:13
 * @description
 *
 * ExecutorService 使用有几种不同的方式来将任务委托给 ExecutorService 去执行：
 *         execute(Runnable)
 *         submit(Runnable)
 *         submit(Callable)
 *         invokeAny(Collection)
 *         invokeAll(Collection)
 */
public class ExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 不要使用Executors 创建线程池
        // 1.execute(Runnable)
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // executorService.execute(() -> {
        //     System.out.println("Asynchronous task");
        // });
        // System.out.println("Asynchronous task");
        //
        // // 2.submit(Runnable)
        // Future future =executorService.submit(() -> {
        //     System.out.println("Asynchronous task");
        // });
        // System.out.println(future.get());
        //
        // // 3.submit(Callable)
        // Future<Object> future1 = executorService.submit(() -> {
        //     System.out.println("Asynchronous Callable");
        //     return "Callable Result";
        // });
        // System.out.println("future.get(): " + future1.get());


        Set<Callable<String>> set = new HashSet<>();
        set.add(() -> {
            return "Task 1";
        });
        set.add(() -> {
            return "Task 2";
        });
        set.add(() -> {
            return "Task 3";
        });

        // 4.invokeAny()
        // String result = executorService.invokeAny(set);
        // System.out.println("result: " + result);

        // 4.invokeAll()
        // List<Future<String>> results = executorService.invokeAll(set);
        // for (Future future : results) {
        //     System.out.println("result: " + future.get());
        // }
        // executorService.shutdownNow();
        // executorService.shutdown();
        // 要终止 ExecutorService 里的线程，你需要调用 ExecutorService 的 shutdown 方法。
        // ExecutorService 并不会立即关闭，但它将不再接受新的任务，而且一旦所有线程都完成了当前任务的时候，ExecutorService 将会关闭。在 shutdown 被调用之前所有提交给ExecutorService 的任务都被执行。

        // 如果你想立即关闭 ExecutorService，你可以调用 shutdownNow 方法


        // ThreadPoolExecutor
        // int corePoolSize = 5;
        // int maximumPoolSize = 10;
        // long keepAliveTime = 5000;
        // ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
        //         .setNameFormat("demo-pool-%d").build();
        // ExecutorService pool = new ThreadPoolExecutor(
        //         corePoolSize,
        //         maximumPoolSize,
        //         keepAliveTime,
        //         TimeUnit.MILLISECONDS,
        //         new LinkedBlockingQueue<Runnable>(1024),
        //         namedThreadFactory,
        //         new ThreadPoolExecutor.AbortPolicy());
        //
        // pool.execute(() -> System.out.println(Thread.currentThread().getName()));
        // pool.execute(() -> {
        //     System.out.println(Thread.currentThread().getName());
        // });
        // pool.shutdown();

        // 定时执行者服务 ScheduleExecutorService
        // shcedule(Callable task,long delay,TimeUnit timeunit)
        // shcedule(Runnable task,long delay,TimeUnit timeunit)
        // shceduleAtFixedRate(Runnable task,long initialDelay,long period,TimeUtil timeutil)
        // shceduleWithFixedDelay(Runnable task,long initialDelay,long period,TimeUtil timeutil)
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(5);
        long beginTime = System.currentTimeMillis();
        System.out.println("beginTime: " + beginTime);
        ScheduledFuture<Object> schedule =scheduledExecutorService.schedule(() -> {
            long endTime = System.currentTimeMillis();
            System.out.println("endTime: " + endTime);
            System.out.println("totalTime: " + (endTime - beginTime));
            System.out.println("Executed!");
            return "Called!";
        }, 5, TimeUnit.SECONDS);
        // 取消执行
        // schedule.cancel(true);
        System.out.println("schedule.get(): " + schedule.get());
        scheduledExecutorService.shutdown();

    }
}
