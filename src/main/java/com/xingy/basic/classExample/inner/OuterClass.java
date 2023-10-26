package com.xingy.basic.classExample.inner;

/**
 * 非静态内部类
 * 在方法体定义的内部类，需要依赖外部类
 */
public class OuterClass {
    private String outerName;

    public void display() {
        System.out.println("OuterClass display");
        System.out.println(this.outerName);
    }

    public class InnerClass {
        private String innerName;

        public void display() {
            System.out.println("InnerClass display");
            System.out.println(this.innerName);
        }

        public InnerClass(){
            this.innerName = "Inner Class";
        }

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
        // 方法体外定义的，需要依赖外部类
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }
}
