package com.mateacademy.lessons7.exz;

import java.util.concurrent.Semaphore;

public class CountThread implements Runnable {

    private CommonResourse  res;
    private Semaphore semaphore;
    private String name;

    public CountThread(CommonResourse res, Semaphore semaphore, String name) {
        this.res = res;
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "waiting");
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
        for (int i = 0; i < 5; i++) {
            res.incrementValue();
            System.out.println(this.name + ":" + res.getValue());
                Thread.sleep(100);
            }
            }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " end work");
        semaphore.release();
    }
}
