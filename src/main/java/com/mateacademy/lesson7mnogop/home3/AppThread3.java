package com.mateacademy.lesson7mnogop.home3;

public class AppThread3 extends Thread{
    @Override
    public void run() {
//      System.out.print("...0%");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Start third thread ");
        System.out.println("Timer status:");
        for (int i = 1; i < 101; i++) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r..." + i + "%");
        }
        System.out.println("\nFinish third thread");
    }
}
