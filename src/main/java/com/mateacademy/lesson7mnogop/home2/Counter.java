package com.mateacademy.lesson7mnogop.home2;

public class Counter extends Thread {
    private Integer c = 0;

    public synchronized void inc() {
        c++;
    }

    public synchronized void dec() {
        c--;
    }

    public synchronized int get() {
        return c;
    }
}
