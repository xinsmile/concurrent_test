package com.xingy.basic.classExample.inner;

/**
 * 非静态内部类
 *
 */
public class OuterClass2 {
    private String outerName;

    public void display() {
        System.out.println("OuterClass display");
        System.out.println(this.outerName);
        class InnerClass {
            public void print() {
                System.out.println("InnerClass print");
            }
        }
        // 方法体内定义的，不需要依赖外部类
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    public static void main(String[] args) {
        OuterClass2 outerClass = new OuterClass2();
        outerClass.display();
    }
}
