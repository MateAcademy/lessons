package com.mateacademy.lessons7.lock;

public class App1 {
    int t = 0;
    int t2 = 0;

    Object lock1 = new Object();
    Object lock2 = new Object();

//что бы паралельно работали и была независимость:
    public void sum() {
        synchronized (lock1) {
            t++;
        }
    }

    public void inc() {
        synchronized (lock2) {
            t2--;
        }
    }

}
