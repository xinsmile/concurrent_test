package com.xingy.basic.staticExample;

/**
 * java静态代码块，构造方法，构造代码块的执行先后顺序
 *
 * 1、执行顺序
 * 静态代码块>构造代码块>构造方法
 *
 * 原因：
 *
 * 静态代码块（static{}）在类加载的时候执行一次，是最早被执行的。
 * 构造代码块（{}内的部分）在每一次创建对象时执行，始终在构造方法前执行。
 * 构造方法在新建对象时调用（ 就是new的时候 ）。
 * 注意：
 *
 * 静态代码块在类加载的时候就执行，所以它的优先级高于入口main()方法。
 * 当静态成员变量/静态代码块不止一次出现，同优先级是按照先后顺序执行。
 *
 *
 * 打印：
 * 构造块
 * 构造块
 * 静态块
 * 构造块
 */
public class StaticTest {
    public static StaticTest s1 = new StaticTest();
    public static StaticTest s2 = new StaticTest();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
    }

}
