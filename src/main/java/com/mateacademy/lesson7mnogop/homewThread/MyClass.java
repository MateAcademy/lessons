package com.mateacademy.lesson7mnogop.homewThread;

public class MyClass {

    public synchronized void summ() throws InterruptedException {
        System.out.print("...0");
        for (int i = 0; i < 301; i++) {
            Thread.sleep(1000);
            System.out.print("\r..." + i + "%");
        }
    }

    public synchronized void del() {
        System.out.print("...0");
        for (int i = 0; i < 201; i++) {
            try {
                Thread.sleep(1000);
                System.out.print("\r..." + i + "%");
            } catch (InterruptedException e) {
                System.err.println("InterruptedException");
            }

        }
    }

    public synchronized void get() {
        System.out.print("...0");
        for (int i = 0; i < 101; i++) {
            System.out.print("\r..." + i);
        }
    }

    public void fo() {
        synchronized (this) { int p = 0;
            for (int i = 0; i < 101; i++) {
                System.out.print("\r..." + i);
                p=i;
            }
            System.out.println(p);
        }
    }
}
