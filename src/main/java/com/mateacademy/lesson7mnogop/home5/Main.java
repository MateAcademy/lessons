package com.mateacademy.lesson7mnogop.home5;

public class Main {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();

//        Thread.yield(); //просит шедлера, расписания, распределение времени потоков, говорю джаве подожди запусти другой поток
//        myThread.setPriority(10);

        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        myThread.interrupt();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//        }
        System.out.println("thread main");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread 0");

        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}