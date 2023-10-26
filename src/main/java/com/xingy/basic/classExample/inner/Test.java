package com.xingy.basic.classExample.inner;

public class Test {
//    public static void main(String[] args) {
//        //通过实现类的方式
//        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
//        myInterfaceImpl.test();
//
//        //匿名内部类
//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public void test() {
//                System.out.println("test");
//            }
//        };
//        myInterface.test();
//    }

    public class MyImpl implements MyInterface {

        @Override
        public void test() {
            System.out.println("test");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        MyImpl myImpl = test.new MyImpl();
        myImpl.test();
    }
}
