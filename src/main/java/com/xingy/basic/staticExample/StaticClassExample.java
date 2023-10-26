package com.xingy.basic.staticExample;

public class StaticClassExample {
    static int staticVariable;

    public StaticClassExample() {

    }

    // 静态方法
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        StaticClassExample staticClassExample = new StaticClassExample();

        System.out.println(StaticClassExample.staticVariable);
    }
}


