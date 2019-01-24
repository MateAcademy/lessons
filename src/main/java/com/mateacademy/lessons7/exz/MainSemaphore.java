package com.mateacademy.lessons7.exz;

import java.util.concurrent.Semaphore;

public class MainSemaphore {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3);
        CommonResourse res = new CommonResourse(0);

        new Thread(new CountThread(res, sem, "CountThread 1")).start();
        new Thread(new CountThread(res, sem, "CountThread 2")).start();
        new Thread(new CountThread(res, sem, "CountThread 3")).start();
    }
}
