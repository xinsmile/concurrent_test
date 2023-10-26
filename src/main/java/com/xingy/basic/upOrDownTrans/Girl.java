package com.xingy.basic.upOrDownTrans;

/**
 * 测试java基础 向上转型/向下转型
 * 向上转型：子类转成父类
 * 向下转型： 强转 父类转成子类 如果是不安全的转换（父类不是子类的类型，即父类对象不是子类向上转型），编译不会报错，运行会报错
 */
public class Girl {
    public void smile() {
        System.out.println("girl smile()...");
    }
}

class MMGirl extends Girl {

    @Override
    public void smile() {

        System.out.println("MMirl smile sounds sweet...");
    }

    public void c() {
        System.out.println("MMirl c()...");
    }
}

class Main {

    public static void main(String[] args) {

        Girl g1 = new MMGirl(); //向上转型
        g1.smile();

        if (g1 instanceof MMGirl) {
            MMGirl mmg2 = (MMGirl) g1;
            mmg2.smile();
            mmg2.c();
        }


        MMGirl mmg = (MMGirl) g1; //向下转型,编译和运行皆不会出错
        mmg.smile();
        mmg.c();


        Girl g2 = new Girl();
//        MMGirl mmg1 = (MMGirl) g2; //不安全的向下转型,编译无错但会运行会出错
//        mmg1.smile();
//        mmg1.c();
        /*output:
         * CGirl smile sounds sweet...
         * CGirl smile sounds sweet...
         * CGirl c()...
         * Exception in thread "main" java.lang.ClassCastException: com.wensefu.other1.Girl
         * at com.wensefu.other1.Main.main(Girl.java:36)
         */
        if (g2 instanceof MMGirl) {
            MMGirl mmg2 = (MMGirl) g2;
            mmg2.smile();
            mmg2.c();
        }

    }
}
