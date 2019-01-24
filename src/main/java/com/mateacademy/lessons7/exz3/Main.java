package com.mateacademy.lessons7.exz3;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        CommonResourse res = new CommonResourse(3);
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(new Thread(new CountThread(res, "CountThread 1")));
        service.execute(new Thread(new CountThread(res, "CountThread 2")));
        service.execute(new Thread(new CountThread(res, "CountThread 3")));

        service.shutdown();
    }
}
