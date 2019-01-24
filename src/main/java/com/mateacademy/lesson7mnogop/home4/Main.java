package com.mateacademy.lesson7mnogop.home4;

public class Main {
    public static void main(String[] args) throws Exception {
//TODO Thread - main:
        System.err.println("-1: " + Thread.currentThread().getName());
//        for (int i = 0; i < 400; i++) {
//            System.err.println("Thread name is - " + Thread.currentThread().getName() + " i = " + i);
//        }
//TODO Thread - 0:
        MyThread myThread = new MyThread();
        myThread.start();

//TODO Thread - 1:
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
//        thread.start();

/*          TODO Thread - 3: */new MyThread().start();
/*          TODO Thread - 4: */new MyThread().start();
/*          TODO Thread - 5: */new MyThread().start();
/*          TODO Thread - 6: */new MyThread().start();
/*          TODO Thread - 7: */new MyThread().start();
/*          TODO Thread - 8: */new MyThread().start();

/*          TODO Thread - 9: */new Thread(myRunnable).start();
/*          TODO Thread - 10: */new Thread(myRunnable).start();
/*          TODO Thread - 11: */new Thread(myRunnable).start();
/*          TODO Thread - 12: */new Thread(myRunnable).start();
/*          TODO Thread - 13: */new Thread(myRunnable).start();


    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("0: " + Thread.currentThread().getName());
//        System.out.println("1: " + Thread.currentThread().getName());
//        for (int i = 0; i < 400; i++) {
//            System.out.println("Thread name is - " + Thread.currentThread().getName() + " i = " + i);
//        }

//       someMethod();
    }
    private void someMethod() {
        throw new RuntimeException();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.err.println("1: " + Thread.currentThread().getName());
    }
}