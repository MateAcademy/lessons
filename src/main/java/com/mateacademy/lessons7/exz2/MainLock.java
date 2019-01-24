//package com.mateacademy.lessons7.exz2;
//
//import com.mateacademy.lessons7.exz.Atomic;
//import com.mateacademy.lessons7.exz.CountThread;
//
//import java.util.concurrent.Semaphore;
//import java.util.concurrent.locks.Lock;
//
//public class MainLock {
//    public static void main(String[] args) {
//        Lock sem = new L(3);
//        com.mateacademy.lessons7.exz.Atomic res = new Atomic(0);
//
//        new Thread(new com.mateacademy.lessons7.exz.CountThread(res, sem, "CountThread 1")).start();
//        new Thread(new com.mateacademy.lessons7.exz.CountThread(res, sem, "CountThread 2")).start();
//        new Thread(new CountThread(res, sem, "CountThread 3")).start();
//    }
//}