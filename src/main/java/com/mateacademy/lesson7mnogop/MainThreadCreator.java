package com.mateacademy.lesson7mnogop;

import java.util.concurrent.TimeUnit;

public class MainThreadCreator {

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);

        };

        Thread thread = new Thread();
        thread.start();

        IntCounter count = new IntCounter(0);
        Runnable task2 = () -> {
            for (int i = 0; i < 5000; i++) {
                count.increment();
            }
        };

        new Thread(task2).start();
        new Thread(task2).start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result count " + count.getCount());
    }

    private static class IntCounter {
        //        private volatile int count;
        private int count;
        private Object object;

        public IntCounter(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        public synchronized void increment() {
//            synchronized (this) {
//
//            }
            count++;
//            System.out.println(count);
        }
    }

}
