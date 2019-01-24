package com.mateacademy.lesson7mnogop.home;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "  -1");

        MyThread myThread = new MyThread();
        myThread.start();


        new MyThread().start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName());

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(  Thread.currentThread().getName());
    }
}