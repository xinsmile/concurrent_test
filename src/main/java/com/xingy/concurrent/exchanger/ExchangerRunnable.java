package com.xingy.concurrent.exchanger;

import java.util.concurrent.Exchanger;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.exchange.ExchangerRunnable
 * @date 2019/07/30 08:50
 * @description
 */
public class ExchangerRunnable implements Runnable {

    Exchanger exchanger = null;
    Object object = null;

    public ExchangerRunnable(Exchanger exchanger, Object object) {
        this.exchanger = exchanger;
        this.object = object;
    }

    @Override
    public void run() {
        try {
            Object previous = this.object;
            this.object = exchanger.exchange(previous);

            System.out.println(
                    Thread.currentThread().getName() +
                            " exchanged " + previous + " for " + this.object
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
