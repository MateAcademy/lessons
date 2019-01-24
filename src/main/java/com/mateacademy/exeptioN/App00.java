package com.mateacademy.exeptioN;

import java.io.IOException;

public class App00 {
    public static void main(String[] args) {
        System.err.println("f: before");
        f();
        System.err.println("f: after");
    }

    public static void f() {
        System.err.println("g: before");
        g();
        System.err.println("g: after");
    }

    public static void g() {
//        return;
//  throw new RuntimeException();
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("IOException e");
        }

    }

}
