package com.xingy.jvm;

import java.io.IOException;

public class TestLazy {

    public static void main(String[] args) throws IOException {
        System.out.println("未用到Student");
        System.in.read();

    }
}
