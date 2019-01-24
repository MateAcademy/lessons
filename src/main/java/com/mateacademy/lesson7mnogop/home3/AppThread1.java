package com.mateacademy.lesson7mnogop.home3;

import java.math.BigDecimal;

public class AppThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Start first thread");
        BigDecimal x = new BigDecimal("0.5");
        BigDecimal y = new BigDecimal("0.1");

        x = x.subtract(y);
        System.out.println("X = " + x);
        x = x.subtract(y);
        System.out.println("X = " + x);
        x = x.subtract(y);
        System.out.println("X = " + x);
        x = x.subtract(y);
        System.out.println("X = " + x);
        x = x.subtract(y);
        System.out.println("X = " + x);

        System.out.println("Finish first thread\n");

    }
}
