//package com.mateacademy.lessons7.exz2;
//
//import com.mateacademy.lessons7.exz.Atomic;
//
//import java.util.concurrent.Semaphore;
//import java.util.concurrent.locks.Lock;
//
//public class CountThread implements Runnable {
//    private com.mateacademy.lessons7.exz.Atomic res;
//    private Lock lock;
//    private String name;
//
//    public CountThread(Atomic res, Lock lock, String name) {
//        this.res = res;
//        this.lock = lock;
//        this.name = name;
//    }
//
//    @Override
//    public void run() {
//        System.out.println(name + "waiting");
//        try {
//            lock.lock();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            for (int i = 0; i < 5; i++) {
//                res.incrementValue();
//                System.out.println(this.name + ":" + res.getValue());
//                Thread.sleep(100);
//            }
//        }catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(name + " end work");
//        semaphore.release();
//    }
//}
