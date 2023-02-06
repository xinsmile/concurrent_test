package com.xingy.concurrent.exchanger;

import java.util.concurrent.Exchanger;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.exchange.ExchangerExample
 * @date 2019/07/30 08:54
 * @description
 */
public class ExchangerExample {
    public static void main(String[] args){
        Exchanger exchanger = new Exchanger();

        ExchangerRunnable exchanger1 =
                new ExchangerRunnable(exchanger, "Thread0-数据");

        ExchangerRunnable exchanger2 =
                new ExchangerRunnable(exchanger, "Thread1-数据");

        new Thread(exchanger1).start();
        new Thread(exchanger2).start();
    }
}
