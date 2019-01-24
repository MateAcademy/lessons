package com.mateacademy.lessons7.exz4atonic;

import java.util.concurrent.atomic.AtomicInteger;

public class CountThread implements Runnable {

    private AtomicInteger res;

    private String name;

    public CountThread(AtomicInteger res, String name) {
        this.res = res;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "waiting");


        try {
            for (int i = 0; i < 5; i++) {
                res.incrementAndGet();
                System.out.println(this.name + ":" + res.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());

        }
    }
}
