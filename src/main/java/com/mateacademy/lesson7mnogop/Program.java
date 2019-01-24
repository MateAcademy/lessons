package com.mateacademy.lesson7mnogop;

public class Program {
    public static void main(String[] args) throws InterruptedException {
//      boolean r = System.out.print("%.f\n", 895.745 ).checkError();
//      System.out.println(r);

        System.out.print("...0");
        for (int i = 0; i < 101; i++) {
            Thread.sleep(1000);
            System.out.print("\r..." + i + "%");
        }
        System.out.println();
    }
}
