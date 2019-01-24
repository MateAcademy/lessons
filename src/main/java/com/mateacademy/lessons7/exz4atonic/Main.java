package com.mateacademy.lessons7.exz4atonic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger res = new AtomicInteger(3);
        ExecutorService service = Executors.newFixedThreadPool(2);

       Thread thread = new Thread(new CountThread(res, "0---"));
       Thread thread2 = new Thread(new CountThread(res, "1---"));
       Thread thread3 = new Thread(new CountThread(res, "2---"));

       service.execute(thread);
       service.execute(thread2);
       service.execute(thread3);
    }
}
