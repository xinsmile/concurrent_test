package com.xingy.basic.staticExample;

/**
 * 父类(抽象类)
 *
 * 父类和子类代码执行顺序：
 *
 * 父类静态代码块 =》 子类静态代码块 =》 父类代码块 =》 父类构造方法 =》 子类代码块 =》 子类构造方法
 *
 *
 * 父类静态代码执行了
 * 子类静态代码执行了
 * 父类非静态代码执行了
 * 父类构造函数代码执行了
 * 子类非静态代码执行了
 * 子类构造函数代码执行了
 */
public abstract class Father {

    static {
        System.out.println("父类静态代码执行了");
    }

    {
        System.out.println("父类非静态代码执行了");
    }

    public Father() {
        System.out.println("父类构造函数代码执行了");
    }

    public static void main(String[] args) {
        Father father = new Son();

//        Son son = new Son();
    }
}
