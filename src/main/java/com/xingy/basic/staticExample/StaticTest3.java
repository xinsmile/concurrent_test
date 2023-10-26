package com.xingy.basic.staticExample;

/**
 *
 * 测速静态类包含其它静态类的成员变量。执行顺序。
 *
 *
 * null StaticTest3 构造块
 * t1 StaticTest3 构造方法代码
 * null StaticTest4 构造块
 * t3 StaticTest4 构造方法代码
 * null StaticTest3 构造块
 * t4 StaticTest3 构造方法代码
 * t3 StaticTest4 静态块
 * null StaticTest4 构造块
 * t2 StaticTest4 构造方法代码
 * t4 StaticTest3 静态块
 * null StaticTest3 构造块
 * StaticTest3 main StaticTest3 构造方法代码
 * null StaticTest4 构造块
 * StaticTest4 main StaticTest4 构造方法代码
 *
 *
 */
public class StaticTest3 {
    public static StaticTest3 t1 = new StaticTest3("t1");
    public static StaticTest4 t2 = new StaticTest4("t2");

    private String name;

    public static String name2;

    {
        System.out.println(name + " StaticTest3 构造块");
    }

    static {
        System.out.println(name2 + " StaticTest3 静态块");
    }

    public StaticTest3(String name) {
        this.name = name;
        name2 = name;
        System.out.println(name + " StaticTest3 构造方法代码");
    }

    public static void main(String[] args) {
        StaticTest3 t = new StaticTest3("StaticTest3 main");
        StaticTest4 t4 = new StaticTest4("StaticTest4 main");
    }
}

class StaticTest4 {

    public static StaticTest4 t3 = new StaticTest4("t3");

    public static StaticTest3 t4 = new StaticTest3("t4");

    private String name;

    public static String name2;

    {
        System.out.println(name + " StaticTest4 构造块");
    }

    static {
        System.out.println(name2 + " StaticTest4 静态块");
    }

    public StaticTest4(String name) {
        this.name = name;
        name2 = name;
        System.out.println(name + " StaticTest4 构造方法代码");
    }
}