package com.xingy.concurrent.delayQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.delayQueue.DelayedElement
 * @date 2019/07/29 15:21
 * @description DelayQueue 对元素进行持有直到一个特定的延迟到期。注入其中的元素必须实现 concurrent.Delay 接口
 */
public class DelayedElement implements Delayed {

    long delayTime;
    long tamp;

    DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        tamp = delayTime + System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return tamp - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        return tamp - ((DelayedElement) o).tamp > 0 ? 1 : -1;
    }
}
