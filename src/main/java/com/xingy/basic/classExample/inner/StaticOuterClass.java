package com.xingy.basic.classExample.inner;

/**
 * 静态内部类
 * 不需要依赖外部类
 */
public class StaticOuterClass {
    private String outerName;

    public void display() {
        System.out.println("OuterClass display");
        System.out.println(this.outerName);
    }

    public static class InnerClass {
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
        StaticOuterClass outerClass = new StaticOuterClass();
        outerClass.display();
        // 方法体外定义的，需要依赖外部类
        StaticOuterClass.InnerClass innerClass = new InnerClass();
        innerClass.display();
    }
}
