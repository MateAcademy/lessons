package com.mateacademy.lesson7mnogop.home1;

public class Counter {
        int c1;
        int c2;

        Object lock1 = new Object();
        Object lock2 = new Object();

        public void inc1() {
            synchronized (lock1) {
                c1++;
            }
        }

        public void inc2() {
            synchronized (lock2) {
                c2++;
            }
        }
}
