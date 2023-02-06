package com.xingy.concurrent.priorityBlockingQueue;

/**
 * @author xinguiyuan
 * @className com.xingy.concurrent.priorityBlockingQueue.User
 * @date 2019/07/29 16:22
 * @description
 */
public class User implements Comparable<User> {

    int age;
    String name;

    User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return this.age > o.age ? -1 : 1;
    }
}
