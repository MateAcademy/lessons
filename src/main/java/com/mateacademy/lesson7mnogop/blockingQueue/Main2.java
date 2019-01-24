package com.mateacademy.lesson7mnogop.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main2 {
    public static void main(String[] args) throws InterruptedException{
//        Queue<String> queue = new PriorityQueue<>();

        BlockingQueue<String> queue = new PriorityBlockingQueue<>();
        new Thread(){
            @Override
            public void run() {
                //System.out.println(queue.remove());
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public synchronized void start() {
                queue.add("this is string");
            }
        }.start();

    }
}
