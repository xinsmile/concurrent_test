package com.xingy.collect.list;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {

    public static void failFast() {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("A"));
        arrayList.add(new Student("B"));
        arrayList.add(new Student("C"));
        arrayList.add(new Student("D"));
        for (Student student : arrayList) {
            System.out.println("name = " + student.name);
        }
    }

    public static void failSafe() {
        CopyOnWriteArrayList<Student> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add(new Student("A"));
        arrayList.add(new Student("B"));
        arrayList.add(new Student("C"));
        arrayList.add(new Student("D"));
        for (Student student : arrayList) {
            System.out.println("name = " + student.name);
        }
    }

    private static class Student {
        private String name;
        public Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        failFast();
//        failSafe();
    }
}
