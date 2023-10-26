package com.xingy.basic.staticExample;

/**
 *
 * null 构造块
 * s1 构造方法代码
 * null 构造块
 * s2 构造方法代码
 * s2 静态块
 * null 构造块
 * main 构造方法代码
 */
public class StaticTest2 {
    public static StaticTest2 t1 = new StaticTest2("s1");
    public static StaticTest2 t2 = new StaticTest2("s2");

    private String name;

    public static String name2;

    {
        System.out.println(name + " 构造块");
    }

    static {
        System.out.println(name2 + " 静态块");
    }

    public StaticTest2(String name) {
        this.name = name;
        name2 = name;
        System.out.println(name + " 构造方法代码");
    }

    public static void main(String[] args) {
        StaticTest2 t = new StaticTest2("main");
    }
}
