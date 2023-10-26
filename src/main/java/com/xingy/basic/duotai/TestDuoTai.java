package com.xingy.basic.duotai;

/**
 * 多态练习
 */
public class TestDuoTai {
    public static void main(String[] args) {

        //TODO 创建父类对象测
        Fu f = new Fu();f.eat();//爸爸在吃肉
        //TODO 创建子类对象测
        Zi z = new Zi();z.eat();//儿子在喝汤

        //TODO 创建多态对象测
        //1、多态：统一调用标准，统一只能调用父类提供的功能
        Fu f2 = new Zi();//父类引用， 指向 子类对象
        //2、编译看左边--想要保存，需要调用左边的功能
        //3、运行看右边  -- 运行的结果，怎么干活的，看右边看子类的实现方式
        f2.eat();//调用的是父类的eat()，但是结果是子类重写后的效果
        f2.show();

    }
}

//创建父类
class Fu{
    public void eat() {
        System.out.println("eat. 爸爸在吃肉");
    }

    public void show() {
        System.out.println("show. 儿子在喝汤");
    }
}

//创建子类
//4、多态的前提1：发生继承关系
class Zi extends Fu{
    //5、多态的前提2：发生方法重写
    public void eat() {
        System.out.println("eat. 儿子在喝汤");
    }

}
